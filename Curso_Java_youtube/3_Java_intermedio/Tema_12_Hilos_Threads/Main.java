public class Main {
    public static void main(String[] args) {
        
        //La mas recomendable
        // con el hilo uno se utiliza esto lla que lo ereda
        Hilo_1 hilo_1 = new Hilo_1();
        
        // el hilo de la segunda forma
        Thread hilo_2 = new Thread(new Hilo_2());

        // para arrancar los hilos
        // se crean primero y leugo de colocan asi

        // Se van a imprimir de manera simultanea de esta
        // forma
        hilo_1.start();
        hilo_2.start();
    }
}
