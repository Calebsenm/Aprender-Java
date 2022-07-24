
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;

public class App extends JFrame implements ActionListener {

    public JLabel Nombre_lavel;
    public JLabel Grupo_lavel;
    public JLabel Codigo_lavel;
    public JLabel Resultado_lavel;

    public JButton Regristrar_button;
    public JButton Modificar_button;
    public JButton Eliminar_button;
    public JButton Buscar_button;

    public JTextField nombre_field;
    public JTextField codigo_field;
    public JTextField grupo_field;

    public String Nombre_variable;
    public String Grupo_variable;
    public String Codigo_variable;

    private String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public App() {

        setLayout(null);

        // nombre
        Nombre_lavel = new JLabel("Nombre");
        Nombre_lavel.setBounds(20, 20, 100, 30);
        add(Nombre_lavel);
        nombre_field = new JTextField();
        nombre_field.setBounds(120, 15, 100, 30);
        add(nombre_field);

        // grupo
        Grupo_lavel = new JLabel("Grupo");
        Grupo_lavel.setBounds(20, 45, 100, 30);
        add(Grupo_lavel);
        grupo_field = new JTextField();
        grupo_field.setBounds(120, 45, 100, 30);
        add(grupo_field);

        // botones
        // registro
        Regristrar_button = new JButton("Registrar");
        Regristrar_button.setBounds(10, 80, 90, 30);
        Regristrar_button.addActionListener(this);
        add(Regristrar_button);

        Modificar_button = new JButton("Modificar");
        Modificar_button.setBounds(100, 80, 90, 30);
        Modificar_button.addActionListener(this);
        add(Modificar_button);

        Eliminar_button = new JButton("Eliminar");
        Eliminar_button.setBounds(190, 80, 90, 30);
        Eliminar_button.addActionListener(this);
        add(Eliminar_button);

        // codigo
        Codigo_lavel = new JLabel("Ingresa el codigo del alumno");
        Codigo_lavel.setBounds(20, 120, 200, 30);
        add(Codigo_lavel);

        codigo_field = new JTextField();
        codigo_field.setBounds(20, 150, 160, 30);
        add(codigo_field);

        // buscar y mostrar
        Buscar_button = new JButton("Buscar");
        Buscar_button.setBounds(20, 190, 100, 30);
        Buscar_button.addActionListener(this);
        add(Buscar_button);

        Resultado_lavel = new JLabel("");
        Resultado_lavel.setBounds(20, 210, 200, 50);
        Resultado_lavel.setFont(new Font("Serif", Font.PLAIN, 20));
        add(Resultado_lavel);

    }

    public static void main(String[] args) {
       
        App ventana = new App();
        ventana.setBounds(0, 0, 300, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Regristrar_button) {
            try {
                
                
                // para connectar a la base de datos url usuario pasword
                //Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/practica", "root", "000");
                PreparedStatement pat = cn.prepareStatement("insert into alumnos values(?,?,?)");
                 
                pat.setString(1, "O");
                pat.setString(2, Nombre_lavel.getText().trim());
                pat.setString(3, Grupo_lavel.getText().trim());
                pat.executeUpdate();

                Nombre_lavel.setText("");
                Grupo_lavel.setText("");
                Resultado_lavel.setText("Registro Existoso");

            } catch (Exception E) {
                System.out.println("EROR" + E);
            }
        }   else  if (e.getSource() == Modificar_button) {
            try {
               
                
                // para connectar a la base de datos url usuario pasword
                //Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/practica", "root", "000");
                PreparedStatement pat = cn.prepareStatement("select * from alumnos where ID = ?");
                
                pat.setString(1,codigo_field.getText().trim());

                // para estraer el dato 
                ResultSet rs = pat.executeQuery();

                if (rs.next()){
                    nombre_field.setText(rs.getString("Nombre_Almno"));
                    grupo_field.setText(rs.getString("Grupo"));
                
                }   else{
                    JOptionPane.showMessageDialog(null,"Alumno no registrado");
                }
               
                pat.executeUpdate();

                Nombre_lavel.setText("");
                Grupo_lavel.setText("");
                Resultado_lavel.setText("Registro Existoso");
                
            } catch (Exception E) {
                System.out.println("EROR" + E);
            }  

        }   else  if (e.getSource() == Eliminar_button) {

        
        }
    }
}
