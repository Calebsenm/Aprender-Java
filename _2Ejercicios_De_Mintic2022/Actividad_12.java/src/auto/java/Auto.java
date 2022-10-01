package auto.java;

public class Auto {
    
    private String Placa;
    private int DiasDesdeUltimoMantenimiento;
    private boolean TieneSeguro;

    public String getPlaca() {
        return Placa;
    }

    private boolean LLave;
    private boolean LLave2;
    //Constructor
    public Auto(String Placa, int DiasDesdeUltimoMantenimiento, boolean TieneSeguro){
        this.Placa = Placa;
        this.DiasDesdeUltimoMantenimiento = DiasDesdeUltimoMantenimiento;
        this.TieneSeguro = TieneSeguro;
    }

    public boolean NesecitaMantenimiento(){
        
        if(DiasDesdeUltimoMantenimiento >= 20){
            // System.out.print("Nesecita mantenimiento ");
            return true;
        }else {
            // System.out.print("No Nesecita mantenimiento ");
            return false;
            
        }
        
    }

    public boolean SePuedeRentar(){
        if((TieneSeguro == true) && (DiasDesdeUltimoMantenimiento <= 20)){
            // System.out.print("Se puede rentar ");
            LLave2 = true;
        }else{
            // System.out.print("NO Se puede rentar ");
            LLave2 = false;
        }
        return LLave2;
    }
}