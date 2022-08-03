import javax.swing.*;

public class Tema_3_JFrame_nombre extends JFrame {
    // con private solo va a tener acceso a esta linea 
    // creaa el texto 
    private JLabel Pesta1;
    private JLabel Pesta2;
    private JLabel Pesta3;
    
    public Tema_3_JFrame_nombre(){
        //el titulo 
        this.setTitle("Mi interfas"); 

        // para crear la pestaña
        setLayout(null);
        // crear el objeto 
        Pesta1 = new JLabel("interfas grafica 3");
        Pesta1.setBounds(10,20,300,30);
        // los agrega 
        add(Pesta1);

        
        Pesta2 = new JLabel("interfas grafica 2");
        Pesta2.setBounds(10,40,600,60);
        add(Pesta2);

       
        Pesta3 = new JLabel("interfas grafica 3");
        Pesta3.setBounds(10,60,600,60);
        add(Pesta3);
    }
    public static void main(String[] args) {
        Tema_3_JFrame_nombre Pestaña1 = new Tema_3_JFrame_nombre();
      
        Pestaña1.setBounds(0,0,500,300);
        Pestaña1.setLocationRelativeTo(null);
        // bloquea el tamaño 
        Pestaña1.setResizable(false);
        Pestaña1.setVisible(true);

    }
}
