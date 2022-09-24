import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private Cliente Cliente;
    private Auto Auto;
    private LocalDate Fecha;
    private int HorasAlquiler;

    public Alquiler(Cliente cliente, Auto auto, LocalDate fecha, int horasAlquiler) {
        this.Cliente = cliente;
        this.Auto = auto;
        this.Fecha = fecha;
        this.HorasAlquiler = horasAlquiler;

    }

    public Cliente getCliente() {
        return Cliente;
    }

    public Auto getAuto() {
        return Auto;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public int getHorasAlquiler() {
        return HorasAlquiler;
    }

    public int ObtenerDescuento(Alquiler[] alquileres) {
        int Descuento = 0;
        int Acumulacion = 0;

        if (Auto.NesecitaMantenimiento() == false && Auto.SePuedeRentar() == true) {
            for (int i = 0; i < alquileres.length; i++) {

                if (Cliente.getCedula() == alquileres[i].Cliente.getCedula()) {

                   
                    // para comparar los dias entre las fechas
                    long Difencia_Dias = ChronoUnit.DAYS.between(Fecha, alquileres[i].getFecha());
                    if (Difencia_Dias <= 30) {

                        

                        if (Acumulacion < 20) {
                            Descuento = 0;
                        } else if (Acumulacion >= 20 && Acumulacion < 50) {
                            Descuento = 2;
                        } else if (Acumulacion > 50) {
                            Descuento = 5;
                        }
                        
                        Acumulacion += HorasAlquiler;
                    }

                }

            }

        } else {
            Descuento = 0;
        }

        return Descuento;

    }
}
