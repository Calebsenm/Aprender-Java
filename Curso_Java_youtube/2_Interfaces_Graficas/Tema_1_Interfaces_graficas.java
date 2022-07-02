// swing importar elementos
// jframe crear interfaces graficas

// private y public 
// setLayout coerdenadas para elementos en las ventana

import javax.swing.*;

public class Tema_1_Interfaces_graficas extends JFrame {
   private JLabel Pagina_1;

   // constructor diseño de etiqueta
   public Tema_1_Interfaces_graficas() {
      setLayout(null);
      Pagina_1 = new JLabel("Mi Primera ventana");
      // dimenciones
      Pagina_1.setBounds(10, 20, 0, 3);
      // colocarlo dentro dela etiqueta
      add(Pagina_1);
   }

   public static void main(String args[]) {
      Tema_1_Interfaces_graficas formulario_1 = new Tema_1_Interfaces_graficas();
      formulario_1.setBounds(0,0,400,300);
      formulario_1.setVisible(true);
      // para aparecer en el centro de la pantalla 
      formulario_1.setLocationRelativeTo(null);

   }
}