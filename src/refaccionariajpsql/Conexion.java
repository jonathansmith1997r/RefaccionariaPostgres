/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refaccionariajpsql;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Erika Rubi
 */
public class Conexion {
    
    Connection conectar = null;
    String stringcon = "jdbc:postgresql://localhost:5432/RefaccionariaPSQL";
    String usuario = "postgres";
    String pass = "postgres";
    
    public Connection Conecta(){
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(stringcon,usuario,pass);
            //JOptionPane.showMessageDialog(null,"Conexion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error" + e);
        }
        return conectar;
    }
    
}
