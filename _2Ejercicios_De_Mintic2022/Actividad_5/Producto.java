public class Producto {
    
    float Precio;
    String Nombre;

    public Producto(float Precio, String Nombre){

        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setPrecio(float Precio){
        this.Precio = Precio;
    }

    public String getNombre(){
        return Nombre;
    }
    public float getPrecio(){
        return Precio;
    }
}
