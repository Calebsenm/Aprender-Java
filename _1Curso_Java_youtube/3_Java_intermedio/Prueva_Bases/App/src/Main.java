import javax.swing.*; 
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main extends JFrame implements ActionListener{

    JButton button1;
    JTextField field1;
    JTextField field2;
    
    
    public Main(){
        setLayout(null);
        
        button1 = new JButton("Ingresar");
        button1.setBounds(100,300,100,30);
        add(button1);
        button1.addActionListener(this);

        field1 = new JTextField();
        field1.setBounds(100,250,100,30);
        add(field1);

        field2 = new JTextField();
        field2.setBounds(100,200,100,30);
        add(field2);

    }
    

    public static void main(String[] args) {
        Main ventana = new Main();
        ventana.setBounds(0,0,350,500);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);


        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connected");
            
            String url = "jdbc:mysql://localhost:3306/Pass";
            String usuario = "root";
            String passw = "";
            
            Connection con = DriverManager.getConnection(url,usuario,passw);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");
            System.out.println("Connected2"); 
        
        } 
        catch(Exception i){
            System.out.println(i);
        }
    }

    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == button1){
            System.out.println("loro");

            String user = field1.getText().trim();
            String pass = field2.getText().trim();
          

           
           
        }
    }
    
}
