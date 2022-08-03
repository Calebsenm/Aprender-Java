
public class Main_Trigonometricas {
  public static void main(String[] args) {
    


    double Resutado = 0;
    double Angulo_Grados = 45;

    double Angulo_Radianes = Math.toRadians(Angulo_Grados);


    // seno
    Resutado = Math.sin(Angulo_Radianes);
    System.out.println("Seno de " + Angulo_Grados + " Es " + Resutado);

    // coseno
    Resutado = Math.cos(Angulo_Radianes);
    System.out.println("coseno de " + Angulo_Grados + " Es " + Resutado);

    // tangente
    Resutado = Math.tan(Angulo_Radianes);
    System.out.println("Tangente de " + Angulo_Grados + " Es " + Resutado);

    // arco coseno
    double Valor_ingresado = 0.707;
    Angulo_Radianes = Math.acos(Valor_ingresado);
    Angulo_Grados = Math.toDegrees(Angulo_Radianes);
    System.out.println("acoseno de " + Valor_ingresado + " Es " + Angulo_Grados);

     // arco coseno
    Angulo_Radianes = Math.asin(Valor_ingresado);
    Angulo_Grados = Math.toDegrees(Angulo_Radianes);
    System.out.println("asin de " + Valor_ingresado + " Es " + Angulo_Grados);
 
     // arco coseno
    Angulo_Radianes = Math.atan(Valor_ingresado);
    Angulo_Grados = Math.toDegrees(Angulo_Radianes);
    System.out.println("atan de " + Valor_ingresado + " Es " + Angulo_Grados);
 
    


  }  
}
