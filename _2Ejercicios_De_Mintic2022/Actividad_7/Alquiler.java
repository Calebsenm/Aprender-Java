public class Alquiler extends Producto{

    private int dias_Alquiler;
    private int precio_Dias;

    public Alquiler(float Precio, String Nombre, int dias_Alquiler) {
        super(Precio, Nombre);
        this.dias_Alquiler = dias_Alquiler;
        this.precio_Dias = 2000;
    }


    // esto es sobrecasrgar el metodo 
    public float getPrecio(){
        return precio_Dias * dias_Alquiler ;
    }
    
    
}
