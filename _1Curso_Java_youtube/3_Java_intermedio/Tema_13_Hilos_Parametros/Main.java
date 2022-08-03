public class Main {
    public static void main(String[] args) {
        
        Proceso hilo_1  = new Proceso("hilo_1");
        Proceso hilo_2  = new Proceso("hilo_2");  
        Proceso hilo_3  = new Proceso("hilo_3");  

        //De esta manera se envia el valor
        hilo_1.Valor(10);
        hilo_2.Valor(15);
        hilo_2.Valor(10);

        hilo_1.start();
        hilo_2.start();
        hilo_3.start();
    }
}
