package Tema_4_POO_set_gett.Libreria;

public class Lavadora {

    private int KILOS;
    private int Kind_OF;

    private int llenando_completo = 0;
    private int Lavado_completo = 0;
    private int Secado_completo = 0;

    public Lavadora(int kilos, int kinds_of) {
        this.KILOS = kilos;
        this.Kind_OF = kinds_of;
    }

    private void LLenado() {
        if (KILOS <= 12) {

            llenando_completo = 1;
            System.out.println("llenando...");
            System.out.println("Llenano completo");

        } else {

            System.out.println("Se ingresó mas carga de labadora");

        }

    }

    private void Lavado() {
        LLenado();
        if (llenando_completo == 1) {
            if (Kind_OF == 1) {
                System.out.println("Ropa Blanca /lavado sueave");
                System.out.println("Lavando...");
                Lavado_completo = 1;

            } else if (Kind_OF == 2) {
                System.out.println("Ropa de color/lavado intenso");
                System.out.println("Lavando...");
                Lavado_completo = 1;
            } else {
                System.out.println("El tipo de ropa no está disponible");
                System.out.println("Se Lavará como ropa de color");
                Lavado_completo = 1;
            }
        }
    }

    private void Secado() {
        Lavado();
        if (Lavado_completo == 1){
            System.out.println("Secando...");
            Secado_completo = 1;
        }
    }

    public void Ciclo_Completo() {
        Secado();
        if (Secado_completo == 1){
            System.out.println("Tu ropa está lista");
        }
    }

    //setter y getter

    

    // modificar el valor 
    public void setTipoDeRopa(int tipoderopa){
        this.Kind_OF = tipoderopa; 
    }

    // con setter permite colocar la variable que va a seleccionar
    public int  getTipoRopa(){
        return Kind_OF;
    }


    //-----------------------------------------------------------------------
    public int getKilo(){
        return KILOS;
    }

    public void setKilo(int kils){
        this.KILOS = kils;

    }

}
