// se importa la libreria 
import javax.swing.*;

// se estiende la funcion del jframe 
public class Tema_2_JFrame extends JFrame{
    // este es el contructor
    public Tema_2_JFrame(){
        setLayout(null);

    }
    public static void main(String[] args) {
        // abre ele jframe como formulario
        Tema_2_JFrame formulario1 = new Tema_2_JFrame();
        // se le agrega su tamaño y su posicion 
        formulario1.setBounds(350,100,400,550);
        // abre el formulario 
        formulario1.setVisible(true);

        //siempre al centro de la pantalla 
        formulario1.setLocationRelativeTo(null);
        // para modificar el tamaño lo bloquea con false
        formulario1.setResizable(false);
    
    
    }
}
