

public class Mantenimiento extends Producto{

    int Dias_UltimoMatenimiento;

    public Mantenimiento(float Precio, String Nombre) {
        super(Precio, Nombre);
        //TODO Auto-generated constructor stub
    }
    public Mantenimiento(float Precio, String Nombre,int Dias_UltimoMatenimiento) {
        super(Precio, Nombre);
        this.Dias_UltimoMatenimiento = Dias_UltimoMatenimiento;
    }

    public void setPrecio(){

        if(Dias_UltimoMatenimiento > 30){
            this.Precio = Precio + 30000;
        }
        else if(Dias_UltimoMatenimiento < 30){
            this.Precio = Precio + 20000;
        }
    }

    public float getPrecio(){
        return (int) Precio;
    }
}
