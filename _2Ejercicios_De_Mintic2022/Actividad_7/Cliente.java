public class Cliente {

    String Nombre;
    int Edad;
    int Numero;
    
    public Cliente(String Nombre, int Edad){
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Numero = Numero;
    

    }

    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    public void setNonbre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setNumero(int Numero){
        this.Numero = Numero;
    }

    public String getNombre() {
        return Nombre;
    }
    public int getEdad(){
        return Edad;
    }
    public int getNumero(){
        return Numero;
    }



}
