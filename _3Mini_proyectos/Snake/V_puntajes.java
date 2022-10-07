import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;


public class V_puntajes extends JFrame  implements ActionListener{
    

    JButton Cerrar;

    public V_puntajes(){
        setLayout(null);

        this.setResizable(false);
        this.setBounds(0, 0, 510, 510);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        Cerrar = new JButton("Regresar");
        Cerrar.setBounds(300,400,100,50);
        Cerrar.addActionListener(this);
        add(Cerrar);

    }

    public static void main(String[] args) {

        V_puntajes puntajes1 = new V_puntajes();
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == Cerrar){

            super.dispose();
            main A = new main();
            A.setVisible(true);

        }
        
    }
}
