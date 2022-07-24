import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/bd_ventas","root","");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }
    public static void main(String[] args) {
        Conexion cn=new Conexion();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from usuario");
            while (rs.next()) {                
                System.out.println(rs.getInt("ID")+" " +rs.getString("Nombre_Alumno")+" " +rs.getString("Grupo"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
        
    }
}