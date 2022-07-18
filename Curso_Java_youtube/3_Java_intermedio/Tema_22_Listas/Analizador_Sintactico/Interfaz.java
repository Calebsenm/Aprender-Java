
import javax.swing.*;
import java.awt.event.*;



public class Interfaz extends JFrame implements ActionListener {
    private JButton Boton1;
    private JTextField Areas;

    public Interfaz(){
        setLayout(null);
        Boton1 = new JButton("Validar");
        Boton1.setBounds(10, 100, 90, 30);
        add(Boton1);
        Boton1.addActionListener(this);

        Areas = new JTextField();
        Areas.setBounds(10, 50, 200, 30);
        add(Areas);

        Areas.setText("{3*(7-6)-{3*7}-[6-3]}");
    }
    
    public static void main(String[] args) {
        Interfaz formulario1 = new Interfaz();
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (ValidarExpresion()) {
            JOptionPane.showMessageDialog(null, "La formula esta escrita correctamente.");
            } else {
              JOptionPane.showMessageDialog(null, "¡ERROR!, la formula NO esta escrita correctamente.");
            }
    }
    public boolean ValidarExpresion() {
                Pila pila = new Pila();
                String cadena = Areas.getText();
        
                for (int i = 0; i < cadena.length(); i++) {
                    if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                        pila.Insertar(cadena.charAt(i));
                    } else {
        
                        if (cadena.charAt(i) == ')') {
        
                            if (pila.extraer() != '(') {
                                return false;
                            }
        
                        } else {
        
                            if (cadena.charAt(i) == ']') {
        
                                if (pila.extraer() != '[') {
                                    return false;
                                }
        
                            } else {
        
                                if (cadena.charAt(i) == '}') {
                                    if (pila.extraer() != '{') {
                                        return false;
                                    }
                                }
        
                            }
        
                        }
        
                    }
                }
                return pila.PilaVacia();
            }

    
        
  
  

}