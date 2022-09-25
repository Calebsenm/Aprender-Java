public class Reparación extends Producto {

    private String tipo_Reparacion;
    private int Precio_Reparacion;

    public Reparación(float Precio, String Nombre) {
        super(Precio, Nombre);
        // TODO Auto-generated constructor stub
    }

    // esto es sobrescribir el metodo
    public Reparación(float Precio, String Nombre, String tipo_Reparacion) {
        super(Precio, Nombre);
        this.tipo_Reparacion = tipo_Reparacion;

    }

    // sobreescribir el metodo
    public void setPrecio(int precio) {
        if (tipo_Reparacion.equals("Avanzada")) {
            this.Precio_Reparacion = Precio_Reparacion + 10000;
        } else if (tipo_Reparacion.equals("Basica")) {
            this.Precio_Reparacion = Precio_Reparacion + 5000;
        }

        this.Precio_Reparacion += precio;
    }

    public float getPrecio(){
        return Precio_Reparacion;
    }

}
