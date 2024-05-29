-- Database: RefaccionariaPSQL

-- DROP DATABASE "RefaccionariaPSQL";

CREATE DATABASE "RefaccionariaPSQL"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Mexico.1252'
    LC_CTYPE = 'Spanish_Mexico.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
CREATE SCHEMA AdminRefa;

CREATE TABLE AdminRefa.Vehiculo
(
	idVehiculo BIGSERIAL NOT NULL,
	numSerie VARCHAR(50) NOT NULL,
	nombreMarca VARCHAR(100) NOT NULL,
	nombreModelo VARCHAR(100) NOT NULL,
	anio INT NOT NULL,
	descTecnica VARCHAR(100) NOT NULL,
	
	CONSTRAINT PK_Vehiculo PRIMARY KEY(idVehiculo)
);

SELECT * FROM AdminRefa.Vehiculo

CREATE TABLE AdminRefa.Categoria
(
	idCategoria BIGSERIAL NOT NULL,
	nombreCategoria VARCHAR(100) NOT NULL,
	
	CONSTRAINT PK_Categoria PRIMARY KEY(idCategoria)
);

SELECT * FROM AdminRefa.Categoria

CREATE TABLE AdminRefa.Persona
(
	idPersona BIGSERIAL NOT NULL,
	rfc VARCHAR(25) NOT NULL, 
	nombrePersona VARCHAR(100) NOT NULL,
	correo VARCHAR(100) NOT NULL,
	telefono VARCHAR(50) NOT NULL,
	direccion VARCHAR(100) NOT NULL,
	cp VARCHAR(10) NOT NULL,
	estado VARCHAR(50) NOT NULL,
	
	CONSTRAINT PK_Persona PRIMARY KEY(idPersona)
);

SELECT * FROM AdminRefa.Persona

CREATE TABLE AdminRefa.Proveedor
(
	idProveedor BIGSERIAL NOT NULL,
	idPersona BIGINT NOT NULL,
	empresa VARCHAR(100) NOT NULL,
	gerente VARCHAR(100) NOT NULL,
	giro VARCHAR(100) NOT NULL,
	
	CONSTRAINT PK_Proveedor PRIMARY KEY(idProveedor),
	CONSTRAINT FK_Persona FOREIGN KEY(idPersona) REFERENCES AdminRefa.Persona(idPersona)
);
CREATE TABLE AdminRefa.Refaccion
(
	idRefaccion BIGSERIAL NOT NULL,
	idCategoria BIGINT NOT NULL,
	idVehiculo BIGINT NOT NULL,
	nombre VARCHAR(100) NOT NULL,
	descripcion VARCHAR(100) NOT NULL,
	precioCompra FLOAT  NULL,
	precioVenta FLOAT NULL,
	stock INT NOT NULL,
	
	CONSTRAINT PK_REFACCION PRIMARY KEY(idRefaccion),
	CONSTRAINT FK_CATEGORIA FOREIGN KEY(idCategoria) REFERENCES AdminRefa.Categoria(idCategoria),
	CONSTRAINT FK_VEHICULO FOREIGN KEY(idVehiculo) REFERENCES AdminRefa.Vehiculo(idVehiculo)	
);

SELECT * FROM AdminRefa.Proveedor

CREATE TABLE AdminRefa.Empleado
(
	idEmpleado BIGSERIAL NOT NULL,
	idPersona SERIAL NOT NULL,
	fechainicio DATE NOT NULL,
	antiguedad int NOT NULL,
	rol VARCHAR(100) NOT NULL,
	
	CONSTRAINT PK_Empleado PRIMARY KEY(idEmpleado),
	CONSTRAINT FK_Persona2 FOREIGN KEY(idPersona) REFERENCES AdminRefa.Persona(idPersona)
);
CREATE TABLE AdminRefa.Venta
(
	idVenta BIGSERIAL NOT NULL,
	idEmpleado SERIAL NOT NULL,
	estadoVenta VARCHAR(100) NOT NULL,
	fecha DATE NOT NULL,
	total FLOAT NOT NULL,
	
	CONSTRAINT PK_VENTA PRIMARY KEY(idVenta),
	CONSTRAINT FK_EMPLEADO FOREIGN KEY(idEmpleado) REFERENCES AdminRefa.Empleado(idEmpleado)
);
CREATE TABLE AdminRefa.Compra
(
	idCompra BIGSERIAL NOT NULL,
	idProveedor SERIAL NOT NULL,
	fecha DATE NOT NULL,
	total FLOAT NOT NULL,
	
	CONSTRAINT PK_COMPRA PRIMARY KEY(idCompra),
	CONSTRAINT FK_PROVEEDOR FOREIGN KEY(idProveedor) REFERENCES AdminRefa.Proveedor(idProveedor)
);
CREATE TABLE adminRefa.detalleVenta
(
	idDetalleVenta BIGSERIAL NOT NULL,
	idFRefaccion SERIAL NOT NULL,
	idFVenta SERIAL NOT NULL,
	Cantidad INT NOT NULL,
	Descuento FLOAT NOT NULL,
	Subtotal FLOAT NOT NULL,
	
	CONSTRAINT PK_DETVENT PRIMARY KEY(idDetalleVenta),
	CONSTRAINT FK_VENTA FOREIGN KEY(idFVenta) REFERENCES AdminRefa.Venta(idVenta),
	CONSTRAINT FK_REFACCION FOREIGN KEY(idFRefaccion) REFERENCES AdminRefa.Refaccion(idRefaccion)
	
);
CREATE TABLE AdminRefa.DetalleCompra
(
	idDetalleCompra BIGSERIAL NOT NULL,
	idRefaccion SERIAL NOT NULL,
	idCompra SERIAL NOT NULL,
	cantidad INT NOT NULL,
	subtotal FLOAT NOT NULL,
	
	CONSTRAINT PK_DETALLECOMPRA PRIMARY KEY(idDetalleCompra),	
	CONSTRAINT FK_REFACCION FOREIGN KEY(idRefaccion) REFERENCES AdminRefa.Refaccion(idRefaccion),	
	CONSTRAINT FK_COMPRA FOREIGN KEY(idCompra) REFERENCES AdminRefa.Compra(idCompra)		
);

CREATE OR REPLACE FUNCTION calcula_precioVenta() RETURNS TRIGGER AS
$$
DECLARE 
	idRefa bigint;
	preciocp float;
	
BEGIN
	idRefa = NEW.idrefaccion;
	preciocp = NEW.precioCompra;
	UPDATE adminrefa.refaccion SET precioventa = preciocp + (preciocp * 0.20)
	WHERE idrefaccion = idRefa;
	
	RETURN NULL;

END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER TG_calculaPrecioCompra AFTER INSERT ON adminrefa.refaccion
FOR EACH ROW
EXECUTE PROCEDURE calcula_precioVenta();

CREATE OR REPLACE FUNCTION calcula_antiguedad() RETURNS TRIGGER AS
$$
DECLARE
	idEmp BIGINT;
	antiguedad INT;
	fechaIni DATE;
	fechaAct DATE;
BEGIN
	idEmp = NEW.idEmpleado;
	fechaIni = NEW.fechaIn;
	fechaAct = CURRENT_DATE;
	UPDATE adminrefa.empleado SET antiguedad = (SELECT EXTRACT(year FROM CURRENT_DATE)) - (SELECT EXTRACT(year FROM fechaIni))
	WHERE idEmpleado = idEmp;
	RETURN NULL;
END;
$$ LANGUAGE plpgsql;
	
	
CREATE TRIGGER TG_calculaAntiguedad AFTER INSERT ON adminrefa.empleado
FOR EACH ROW
EXECUTE PROCEDURE calcula_antiguedad();

CREATE OR REPLACE FUNCTION calcula_subtotalc() RETURNS TRIGGER AS
$$
DECLARE
	idDetComp BIGINT;
	idtCompra BIGINT;
	idtRefaccion BIGINT;
	descuento FLOAT;
	
BEGIN
	idDetComp = NEW.iddetallecompra;
	idtCompra = NEW.idcompra;
	idtRefaccion = NEW.idfrefaccion;
	
	UPDATE adminrefa.detallecompra SET subtotal = (SELECT precioCompra FROM adminrefa.refaccion WHERE idRefaccion = idtRefaccion) * new.cantidad
	WHERE iddetallecompra = idDetComp;						
	RETURN NULL;
END 
$$ LANGUAGE plpgsql;
CREATE OR REPLACE FUNCTION actualiza_totalC() RETURNS TRIGGER AS
$$
DECLARE 
detalleCompra BIGINT;
subtotal_sum float;
subtotal_res float;
BEGIN
		
  		IF (TG_OP = 'UPDATE') THEN

			detalleCompra = NEW.idCompra;
			subtotal_sum = NEW.subtotal;
			
			UPDATE adminrefa.Compra SET
			total = total + subtotal_sum WHERE idcompra = detallecompra;

        ELSIF (TG_OP = 'DELETE') THEN

			detalleCompra = OLD.idCompra;
			subtotal_res = OLD.subtotal;
			
			UPDATE adminrefa.Compra SET
			total = total - subtotal_res WHERE idCompra = detalleCompra;

        END IF;
		RETURN NULL;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER TG_calculaSubtotalc AFTER INSERT ON adminrefa.detallecompra
FOR EACH ROW
EXECUTE PROCEDURE calcula_subtotalc();

CREATE TRIGGER TG_actualizaTotalC AFTER UPDATE OR DELETE ON adminrefa.detallecompra
FOR EACH ROW
EXECUTE PROCEDURE actualiza_totalC();

CREATE OR REPLACE FUNCTION calcula_subtotalv() RETURNS TRIGGER AS
$$
DECLARE
	idDetVent BIGINT;
	idtVenta BIGINT;
	idtRefaccion BIGINT;
	descuento FLOAT;
	
BEGIN
	idDetVent = NEW.iddetalleventa;
	idtVenta = NEW.idfventa;
	idtRefaccion = NEW.idfrefaccion;
	descuento = NEW.descuento;
	UPDATE adminrefa.detalleVenta SET subtotal = (SELECT precioVenta FROM adminrefa.refaccion WHERE idRefaccion = idtRefaccion) * new.cantidad
	WHERE iddetalleventa = idDetVent;						
	RETURN NULL;
END
CREATE OR REPLACE FUNCTION Xactualiza_total() RETURNS TRIGGER AS
$$
DECLARE 
detalleVenta BIGINT;
subtotal_sum float;
subtotal_res float;
BEGIN
		
  		IF (TG_OP = 'UPDATE') THEN

			detalleVenta = NEW.idfVenta;
			subtotal_sum = NEW.subtotal;
			
			UPDATE adminrefa.venta SET
			total = total + subtotal_sum WHERE idventa = detalleVenta;

        ELSIF (TG_OP = 'DELETE') THEN

			detalleVenta = OLD.idVenta;
			subtotal_res = OLD.subtotal;
			
			UPDATE adminrefa.venta SET
			total = total - subtotal_res WHERE idVenta = detalleVenta;

        END IF;
		RETURN NULL;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER TG_calculaSubtotalV AFTER INSERT ON adminrefa.detalleventa
FOR EACH ROW
EXECUTE PROCEDURE calcula_subtotalv();
DROP TRIGGER TG_actualizaTotalV ON adminrefa.detalleventa
CREATE TRIGGER TG_actualizaTotalV AFTER UPDATE OR DELETE ON adminrefa.detalleventa
FOR EACH ROW
EXECUTE PROCEDURE Xactualiza_total();



CREATE OR REPLACE FUNCTION calcula_subtotalv() RETURNS TRIGGER AS
$$
DECLARE
	idDetVent BIGINT;
	idtVenta BIGINT;
	idtRefaccion BIGINT;
	descuento FLOAT;
	subtotal_sum float;
	subtotal_res float;
BEGIN
	idDetVent = NEW.iddetalleventa;
	idtVenta = NEW.idfventa;
	idtRefaccion = NEW.idfrefaccion;
	descuento = NEW.descuento;
	
	UPDATE adminrefa.detalleVenta SET subtotal = (SELECT precioVenta FROM adminrefa.refaccion WHERE idRefaccion = idtRefaccion) * new.cantidad
	WHERE iddetalleventa = idDetVent;						
	RETURN NULL;
END
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION resta_stock() RETURNS TRIGGER AS
$$
DECLARE
	idtRefaccion BIGINT;
	cant INT;
BEGIN
	idtRefaccion = NEW.idfrefaccion;
	cant = NEW.cantidad;
	IF(cant <= (SELECT stock FROM adminrefa.refaccion WHERE idrefaccion = idtRefaccion)) THEN
		 
		
		UPDATE adminrefa.refaccion SET stock = stock - cant WHERE idrefaccion = idtRefaccion;
		RETURN NEW;
	ELSEIF(cant >=(SELECT stock FROM adminrefa.refaccion WHERE idrefaccion = idtRefaccion)) THEN
		raise exception 'No hay suficiente stock';
		RETURN NULL;
		
	END IF;
	
END;
$$ LANGUAGE plpgsql;
CREATE TRIGGER TG_restastock BEFORE INSERT ON adminrefa.detalleventa
FOR EACH ROW
EXECUTE PROCEDURE resta_stock();

CREATE USER usuario1 WITH PASSWORD '1234';
CREATE USER usuario2 WITH PASSWORD '1234';
CREATE USER usuario3 WITH PASSWORD '1234';

CREATE ROLE rol_Administrador;
CREATE ROLE rol_Empleado;
CREATE ROLE rol_Gerente;

ALTER USER rol_Administrador SUPERUSER; 

REVOKE ALL ON DATABASE postgres FROM public
GRANT CONNECT ON DATABASE postgres to rol_Administrador
GRANT CONNECT ON DATABASE postgres to rol_Empleado
GRANT CONNECT ON DATABASE postgres to rol_Gerente

GRANT CONNECT ON DATABASE "RefaccionariaPSQL" to rol_Administrador;
GRANT CONNECT ON DATABASE "RefaccionariaPSQL" to rol_Empleado;
GRANT CONNECT ON DATABASE "RefaccionariaPSQL" to rol_Gerente;


GRANT USAGE ON SCHEMA adminrefa TO rol_Administrador
GRANT USAGE ON SCHEMA adminrefa TO rol_Empleado
GRANT USAGE ON SCHEMA adminrefa TO rol_Gerente

GRANT rol_Administrador TO usuario1
GRANT rol_Empleado TO usuario2
GRANT rol_Empleado TO usuario3

---Gerente 
GRANT SELECT, INSERT, UPDATE, DELETE ON TABLE AdminRefa.Compra, AdminRefa.DetalleCompra TO rol_Gerente;
GRANT SELECT, INSERT, UPDATE, DELETE ON TABLE AdminRefa.Empleado, AdminRefa.Persona TO rol_Gerente;
---Empleado
GRANT SELECT, INSERT, UPDATE, DELETE ON TABLE AdminRefa.Venta, AdminRefa.DetalleVenta TO rol_Empleado 
---Administrador 
GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA AdminRefa TO rol_Administrador


GRANT ALL ON ALL SEQUENCES IN SCHEMA AdminRefa TO rol_Administrador;
GRANT ALL ON ALL SEQUENCES IN SCHEMA AdminRefa TO rol_Empleado;
GRANT ALL ON ALL SEQUENCES IN SCHEMA AdminRefa TO rol_Gerente;