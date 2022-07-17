import javax.swing.JOptionPane;

public class Pila {
    
    private Nodo Ultimo_valor;
    int tamaño = 0;
    String Lista = "";


    public Pila(){
        Ultimo_valor = null;
        tamaño = 0;

    }

    // metodo pila vacia
    public boolean PilaVacia(){
        return Ultimo_valor == null;

    }

    //Metodo para insertar un nodo en la pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = Ultimo_valor;
        Ultimo_valor = nuevo_nodo;

        tamaño++;
    }

    //Metodo para eliminar un nodo en la lista
    public int EliminarNodo(){
        int auxiliar = Ultimo_valor.informacion;
        Ultimo_valor = Ultimo_valor.siguiente;
        Ultimo_valor = Ultimo_valor.siguiente;
        tamaño--;
        return auxiliar;
    }

    //Metodo para conocer el ultimo valor ingresado
    public int MostarUltimoValorIngresado(){
        return Ultimo_valor.informacion;
    }

    // Metodo para conocer el tamaño de la pila
    public int TamañoPila(){
        return tamaño;
    }

    //metodo para vaciar la pila
    public void VaciarPila(){
        while(!PilaVacia()){
            EliminarNodo();
        }
    }

    //metodo para mostral el continido de la pila
    public void MostrarValor(){
        Nodo recoriNodo = Ultimo_valor;
    
        while(recoriNodo != null){
            Lista += recoriNodo.informacion + "\n";
            recoriNodo = recoriNodo.siguiente;
        }
    
        JOptionPane.showMessageDialog(null,Lista);
        Lista = "";
    }


}
