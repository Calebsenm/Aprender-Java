package Tema_2POO_AreaRectangulo;
public class Area {

    private int base_1,altura,Area;

    public Area(int Valor_1,int Valor_2){
        this.base_1 = Valor_1;
        this.altura = Valor_2;
    }

    public void Operacion(){
        Area = base_1 * altura;
    }

    public void Resultado(){
        Operacion();
        System.out.println("El area de la suma es : " + Area);
    }

}

