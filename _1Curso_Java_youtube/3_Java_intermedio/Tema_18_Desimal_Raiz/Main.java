import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) {
        

        double numero = 2;
        double Raiz = Math.sqrt(numero);

        System.out.println("la raiz cuadrada de " + numero + "Es: " + Raiz );

        // la clase decimal format                     cantidad de decimales
        DecimalFormat def = new DecimalFormat(".00");
        System.out.println("La rais cuadrada de " + numero + "es : " + def.format(Raiz));

        System.out.println("La rais cuadrada de " + numero + "es : " + String.format("%.2f", Raiz));
        // utilizando math.round
        System.out.println("la raiz cuadrada de " + numero + "Es: " + (double)Math.round(Raiz * 100d) / 100 );
        
        // utilizando la clase big decimal
        BigDecimal bd = new BigDecimal(Raiz);
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        System.out.println("La rais cuadrada de " + numero + bd.doubleValue());
        
    }
}