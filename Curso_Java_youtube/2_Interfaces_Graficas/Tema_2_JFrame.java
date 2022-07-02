import javax.swing.*;


public class Tema_2_JFrame extends JFrame{
    public Tema_2_JFrame(){
        setLayout(null);

    }
    public static void main(String[] args) {
        Tema_2_JFrame formulario1 = new Tema_2_JFrame();
        formulario1.setBounds(350,100,400,550);
        formulario1.setVisible(true);

        //siempre al centro de la pantalla 
        formulario1.setLocationRelativeTo(null);
        // para modificar el tamaño 
        formulario1.setResizable(false);
    
    
    }
}
