import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        int  opcion = 0, nodo_informacion = 0;
        Cola cola = new Cola();

        do{

            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                              "Menú de opciones \n\n"
                            + "1. Insertar un nodo\n"
                            + "2. Extraer un nodi\n"
                            + "3. Mostar contenido de la cola \n"
                            + "4. Salir \n\n"

                ));

                switch(opcion){
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Por favor ingresa el valor a guardar en el nodo -> "
                        ));
                        cola.insertar(nodo_informacion);
                        break;

                    case 2:
                        if (!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null,"se estrajo un nodo con el valor " + cola.Extraer());
                        }   else{
                            JOptionPane.showMessageDialog(null,"La cola está vacia");
                        }

                        break;
                    case 3:
                        cola.Mostrar_contenido();
                        break;
                    case 4:
                        opcion = 4;
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null,"La cola está vacia");
                        
                        break;


                    
                }
            } catch(NullPointerException e){
                System.out.println("Error " + e);
            }

        } while(opcion != 4);
    
    
    }
}
