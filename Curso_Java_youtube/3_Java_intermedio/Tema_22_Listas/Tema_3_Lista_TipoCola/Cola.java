import javax.swing.JOptionPane;

public class Cola {

    private Nodo Iniciocola, Finalcola;
    String Cola = "";

    public Cola() {
        Iniciocola = null;
        Finalcola = null;
    }

    // metodo di la cola está vacia

    public boolean ColaVacia() {

        if (Iniciocola == null) {
            return true;

        } else {
            return false;
        }
    }

    // insertar la cola

    public void insertar(int informacion){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;

        if (ColaVacia()){
            Iniciocola = nuevo_nodo;
            Finalcola = nuevo_nodo;
        }   else{
                Finalcola.siguiente = nuevo_nodo;
                Finalcola = nuevo_nodo;

        }

    }

    // metodo para estraer la cola

    public int Extraer(){
      
        if (!ColaVacia()){
            int informacion = Iniciocola.informacion;

            if(Iniciocola == Finalcola){
                Iniciocola = null;
                Finalcola = null;

            } else{
                Iniciocola = Iniciocola.siguiente;
            }

            return informacion;


        }   else{
                return 0;
        }
    }

    //Metodo para mostrar el contenido de la cola
    public void Mostrar_contenido(){
        Nodo recorrido = Iniciocola;
        String ColaInvertida = "";

        while(recorrido != null){

            Cola += recorrido.informacion;
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = Cola.split(" ");
        for (int i = cadena.length -1 ; i >= 0;i--){
            ColaInvertida += " " + cadena[i];
        }

        JOptionPane.showMessageDialog(null,ColaInvertida);
        Cola =  "";
        
    }


}
