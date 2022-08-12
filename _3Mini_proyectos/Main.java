import java.awt.Color;



public class Main<Graphics> extends JFrame{
  
  public Main(){
    setLayout(null);

  }

  public static void main(String[] args){

    Main ventana = new ventana();
    ventana.setVisible(true);
    ventana.setBounds(0,0,396,400);
    ventana.setLocationRelativeTo(null);
  }


}


