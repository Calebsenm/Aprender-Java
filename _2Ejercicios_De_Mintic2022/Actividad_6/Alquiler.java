import java.time.LocalDate;

public class Alquiler {
    
    private String Cliente;
    private String Auto;
    private LocalDate Fecha;
    private int HorasAlquiler;

    public Alquiler(String Cliente , String Auto, LocalDate Fecha,int HorasAlquiler){
        this.Cliente = Cliente;
        this.Auto = Auto;
        this.Fecha = Fecha;
        this.HorasAlquiler = HorasAlquiler;
    }


    public String getCliente(){
        return Cliente;
    }

    public String getAuto(){
        return Auto;
    }
    
    public LocalDate getFecha(){
        return Fecha;
    }

    public int getHorasAlquiler(){
        return HorasAlquiler;
    }

    public int ObtenerDescuento (Alquiler[] alquileres ){
        return HorasAlquiler;
    }
}
