
package clases;
import java.sql.*;

public class Conexion {
    // coneccion local 
    public static Connection conectar(){
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds","root","");
            return cn;
            
        }   catch(SQLException e){
            System.out.println("Error de coneccion " + e);
        }
        return (null);
    }
}







