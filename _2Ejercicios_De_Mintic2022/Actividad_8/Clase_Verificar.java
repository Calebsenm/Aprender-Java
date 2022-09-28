public class Clase_Verificar {

    private String[] Tablero;
    private int position_0;

    // la llave que activa la ficha
    boolean llave1 = false;
    boolean llave2 = false;
    boolean llave3 = false;
    boolean llave4 = false;
    boolean llave5 = false;
    boolean llave6 = false;
    boolean llave7 = false;
    boolean llave8 = false;
    boolean llave9 = false;

    // loaction of the numbers
    int nuemro1 = 0;
    int numero2 = 1;
    int numero3 = 2;
    int nuemro4 = 3;
    int nuemro5 = 4;
    int nuemro6 = 5;
    int nuemro7 = 6;
    int nuemro8 = 7;
    int nuemro9 = 8;

    // the contructor
    public Clase_Verificar(String Tablero[]) {
        this.Tablero = Tablero;
        Postion_Zero();
        The_action();

    }

    public int getNuemro1() {
        return nuemro1;
    }

    public void setNuemro1(int nuemro1) {
        this.nuemro1 = nuemro1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public int getNuemro4() {
        return nuemro4;
    }

    public void setNuemro4(int nuemro4) {
        this.nuemro4 = nuemro4;
    }

    public int getNuemro5() {
        return nuemro5;
    }

    public void setNuemro5(int nuemro5) {
        this.nuemro5 = nuemro5;
    }

    public int getNuemro6() {
        return nuemro6;
    }

    public void setNuemro6(int nuemro6) {
        this.nuemro6 = nuemro6;
    }

    public int getNuemro7() {
        return nuemro7;
    }

    public void setNuemro7(int nuemro7) {
        this.nuemro7 = nuemro7;
    }

    public int getNuemro8() {
        return nuemro8;
    }

    public void setNuemro8(int nuemro8) {
        this.nuemro8 = nuemro8;
    }

    public int getNuemro9() {
        return nuemro9;
    }

    public void setNuemro9(int nuemro9) {
        this.nuemro9 = nuemro9;
    }

    public boolean isLlave1() {
        return llave1;
    }

    public void setLlave1(boolean llave1) {
        this.llave1 = llave1;
    }

    public boolean isLlave2() {
        return llave2;
    }

    public void setLlave2(boolean llave2) {
        this.llave2 = llave2;
    }

    public boolean isLlave3() {
        return llave3;
    }

    public void setLlave3(boolean llave3) {
        this.llave3 = llave3;
    }

    public boolean isLlave4() {
        return llave4;
    }

    public void setLlave4(boolean llave4) {
        this.llave4 = llave4;
    }

    public boolean isLlave5() {
        return llave5;
    }

    public void setLlave5(boolean llave5) {
        this.llave5 = llave5;
    }

    public boolean isLlave6() {
        return llave6;
    }

    public void setLlave6(boolean llave6) {
        this.llave6 = llave6;
    }

    public boolean isLlave7() {
        return llave7;
    }

    public void setLlave7(boolean llave7) {
        this.llave7 = llave7;
    }

    public boolean isLlave8() {
        return llave8;
    }

    public void setLlave8(boolean llave8) {
        this.llave8 = llave8;
    }

    public boolean isLlave9() {
        return llave9;
    }

    public void setLlave9(boolean llave9) {
        this.llave9 = llave9;
    }

    // this loking for the position of the numbers

    public void Postion_Zero() {
        for (int i = 0; i < Tablero.length; i++) {

            
            if (Tablero[i].equals(" ")){
                position_0 = i;
                setNuemro9(i);
            }
            if(Tablero[i].equals("1")){

                setNuemro1(i);
            }
             if(Tablero[i].equals("2")){
                setNumero2(i);
            }
             if(Tablero[i].equals("3")){
                setNumero3(i);
            }
             if(Tablero[i].equals("4")){
                setNuemro4(i);
            }
             if(Tablero[i].equals("5")){
                setNuemro5(i);
            }
             if(Tablero[i].equals("6")){
                setNuemro6(i);
            }
            if(Tablero[i].equals("7")){
                setNuemro7(i);
            }
            if(Tablero[i].equals("8")){
                setNuemro8(i);
            }
            
        }

        position_0 += 1;

    }

    public void the_algoritmous_Maximous(){

    }


    public void The_action() {
        if (position_0 == 0) {

        } else if (getZero() == 1) {
        
            if(Tablero[1].equals("1") || Tablero[3].equals("1")){
                setLlave1(true);
            }
            if(Tablero[1].equals("2")|| Tablero[3].equals("2")){
                setLlave2(true);
            }
            if(Tablero[1].equals("3")|| Tablero[3].equals("3")){
                setLlave3(true);
            }
            if(Tablero[1].equals("4") || Tablero[3].equals("4")){
                setLlave4(true);
            }
            if(Tablero[1].equals("5") || Tablero[3].equals("5")){
                setLlave5(true);
            }
            if(Tablero[1].equals("6") || Tablero[3].equals("6")){
                setLlave6(true);
            }
            if(Tablero[1].equals("7") || Tablero[3].equals("7")){
                setLlave7(true);
            }
            if(Tablero[1].equals("8")|| Tablero[3].equals("8")){
                setLlave8(true);
            }

        } else if (getZero() == 2) {

            if(Tablero[0].equals("1")|| Tablero[4].equals("1") || Tablero[2].equals("1")){
                setLlave1(true);
            }
            if(Tablero[0] .equals("2") || Tablero[4].equals("2")|| Tablero[2].equals("2")){
                setLlave2(true);
            }
            if(Tablero[0].equals("3") || Tablero[4].equals("3") || Tablero[2].equals("3")){
                setLlave3(true);
            }
            if(Tablero[0].equals("4") || Tablero[4].equals("4") || Tablero[2].equals("4")){
                setLlave4(true);
            }
            if(Tablero[0].equals("5") || Tablero[4].equals("5") || Tablero[2].equals("5")){
                setLlave5(true);
            }
            if(Tablero[0].equals("6") || Tablero[4].equals("6") || Tablero[2].equals("6")){
                setLlave6(true);
            }
            if(Tablero[0].equals("7") || Tablero[4].equals("7") || Tablero[2].equals("7")){
                setLlave7(true);
            }
            if(Tablero[0].equals("8") || Tablero[4].equals("8") || Tablero[2].equals("8")){
                setLlave8(true);
            }

        } else if (getZero() == 3) {
            if(Tablero[1].equals("1") || Tablero[1] .equals("1") || Tablero[5] .equals("1") ){
                setLlave1(true);
            }
            if(Tablero[1].equals("2") || Tablero[1] .equals("2") || Tablero[5] .equals("2") ){
                setLlave2(true);
            }
            if(Tablero[1].equals("3") || Tablero[1] .equals("3") || Tablero[5] .equals("3") ){
                setLlave3(true);
            }
            if(Tablero[1].equals("4") || Tablero[1] .equals("4") || Tablero[5] .equals("4") ){
                setLlave4(true);
            }
            if(Tablero[1].equals("5") || Tablero[1] .equals("5") || Tablero[5] .equals("5") ){
                setLlave5(true);
            }
            if(Tablero[1].equals("6") || Tablero[1] .equals("6") || Tablero[5] .equals("6") ){
                setLlave6(true);
            }
            if(Tablero[1].equals("7") || Tablero[1] .equals("7") || Tablero[5] .equals("7")) {
                setLlave7(true);
            }
            if(Tablero[1].equals("8") || Tablero[1] .equals("8") || Tablero[5] .equals("8") ){
                setLlave8(true);
            }



        } else if (getZero() == 4) {
            if(Tablero[0].equals("1") || Tablero[4].equals("1") || Tablero[6].equals("1") ){
                setLlave1(true);
            }
            if(Tablero[0].equals("2") || Tablero[4].equals("2") || Tablero[6].equals("2") ){
                setLlave2(true);
            }
            if(Tablero[0].equals("3") || Tablero[4].equals("3") || Tablero[6].equals("3") ){
                setLlave3(true);
            }
            if(Tablero[0].equals("4") || Tablero[4].equals("4") || Tablero[6].equals("4") ){
                setLlave4(true);
            }
            if(Tablero[0].equals("5") || Tablero[4].equals("5") || Tablero[6].equals("5") ){
                setLlave5(true);
            }
            if(Tablero[0].equals("6") || Tablero[4].equals("6") || Tablero[6].equals("6") ){
                setLlave6(true);
            }
            if(Tablero[0].equals("7") || Tablero[4].equals("7") || Tablero[6].equals("7") ){
                setLlave7(true);
            }
            if(Tablero[0].equals("8") || Tablero[4].equals("8") || Tablero[6].equals("8") ){
                setLlave8(true);
            }
        

        } else if (getZero() == 5) {

            if(Tablero[1].equals("1")|| Tablero[3].equals("1")|| Tablero[5].equals("1")|| Tablero[7].equals("1")){
                setLlave1(true);
            }
            if(Tablero[1].equals("2")|| Tablero[3].equals("2")|| Tablero[5].equals("2")|| Tablero[7].equals("2")){
                setLlave2(true);
            }
            if(Tablero[1].equals("3")|| Tablero[3].equals("3")|| Tablero[5].equals("3")|| Tablero[7].equals("3")){
                setLlave3(true);
            }
            if(Tablero[1].equals("4")|| Tablero[3].equals("4")|| Tablero[5].equals("4")|| Tablero[7].equals("4")){
                setLlave4(true);
            }
            if(Tablero[1].equals("5")|| Tablero[3].equals("5")|| Tablero[5].equals("5")|| Tablero[7].equals("5")){
                setLlave5(true);
            }
            if(Tablero[1].equals("6")|| Tablero[3].equals("6")|| Tablero[5].equals("6")|| Tablero[7].equals("6")){
                setLlave6(true);
            }
            if(Tablero[1].equals("7")|| Tablero[3].equals("7")|| Tablero[5].equals("7")|| Tablero[7].equals("7")){
                setLlave7(true);
            }
            if(Tablero[1].equals("8")|| Tablero[3].equals("8")|| Tablero[5].equals("8")|| Tablero[7].equals("8")){
                setLlave8(true);
            }

        


        } else if (getZero() == 6) {

            if(Tablero[2].equals("1")|| Tablero[2].equals("1")|| Tablero[4].equals("1")|| Tablero[8].equals("1")){
                setLlave1(true);
            }
            if(Tablero[2].equals("2")|| Tablero[2].equals("2")|| Tablero[4].equals("2")|| Tablero[8].equals("2")){
                setLlave2(true);
            }
            if(Tablero[2].equals("3")|| Tablero[2].equals("3")|| Tablero[4].equals("3")|| Tablero[8].equals("3")){
                setLlave3(true);
            }
            if(Tablero[2].equals("4")|| Tablero[2].equals("4")|| Tablero[4].equals("4")|| Tablero[8].equals("4")){
                setLlave4(true);
            }
            if(Tablero[2].equals("5")|| Tablero[2].equals("5")|| Tablero[4].equals("5")|| Tablero[8].equals("5")){
                setLlave5(true);
            }
            if(Tablero[2].equals("6")|| Tablero[2].equals("6")|| Tablero[4].equals("6")|| Tablero[8].equals("6")){
                setLlave6(true);
            }
            if(Tablero[2].equals("7")|| Tablero[2].equals("7")|| Tablero[4].equals("7")|| Tablero[8].equals("7")){
                setLlave7(true);
            }
            if(Tablero[2].equals("8")|| Tablero[2].equals("8")|| Tablero[4].equals("8")|| Tablero[8].equals("8")){
                setLlave8(true);
            }




        } else if (getZero() == 7) {
            if(Tablero[3].equals("1") || Tablero[3].equals("1")|| Tablero[6].equals("1")|| Tablero[7].equals("1")){
                setLlave1(true);
            }
            if(Tablero[3].equals("2") || Tablero[3].equals("2")|| Tablero[6].equals("2")|| Tablero[7].equals("2")){
                setLlave2(true);
            }
            if(Tablero[3].equals("3") || Tablero[3].equals("3")|| Tablero[6].equals("3")|| Tablero[7].equals("3")){
                setLlave3(true);
            }
            if(Tablero[3].equals("4") || Tablero[3].equals("4")|| Tablero[6].equals("4")|| Tablero[7].equals("4")){
                setLlave4(true);
            }
            if(Tablero[3].equals("5") || Tablero[3].equals("5")|| Tablero[6].equals("5")|| Tablero[7].equals("5")){
                setLlave5(true);
            }
            if(Tablero[3].equals("6") || Tablero[3].equals("6")|| Tablero[6].equals("6")|| Tablero[7].equals("6")){
                setLlave6(true);
            }
            if(Tablero[3].equals("7") || Tablero[3].equals("7")|| Tablero[6].equals("7")|| Tablero[7].equals("7")){
                setLlave7(true);
            }
            if(Tablero[3].equals("8") || Tablero[3].equals("8")|| Tablero[6].equals("8")|| Tablero[7].equals("8")){
                setLlave8(true);
            }



        

        } else if (getZero() == 8) {
            if(Tablero[4].equals("1")|| Tablero[6].equals("1") || Tablero[8].equals("1")|| Tablero[8].equals("1")){
                setLlave1(true);
            }
            if(Tablero[4].equals("2")|| Tablero[6].equals("2") || Tablero[8].equals("2")|| Tablero[8].equals("2")){
                setLlave2(true);
            }
            if(Tablero[4].equals("3")|| Tablero[6].equals("3") || Tablero[8].equals("3")|| Tablero[8].equals("3")){
                setLlave3(true);
            }
            if(Tablero[4].equals("4")|| Tablero[6].equals("4") || Tablero[8].equals("4")|| Tablero[8].equals("4")){
                setLlave4(true);
            }
            if(Tablero[4].equals("5")|| Tablero[6].equals("5") || Tablero[8].equals("5")|| Tablero[8].equals("5")){
                setLlave5(true);
            }
            if(Tablero[4].equals("6")|| Tablero[6].equals("6") || Tablero[8].equals("6")|| Tablero[8].equals("6")){
                setLlave6(true);
            }
            if(Tablero[4].equals("7")|| Tablero[6].equals("7") || Tablero[8].equals("7")|| Tablero[8].equals("7")){
                setLlave7(true);
            }
            if(Tablero[4].equals("8")|| Tablero[6].equals("8") || Tablero[8].equals("8")|| Tablero[8].equals("8")){
                setLlave8(true);
            }

         


        } else if (getZero() == 9) {
            if(Tablero[5].equals("1")|| Tablero[7].equals("1")|| Tablero[7].equals("1")|| Tablero[5].equals("1")){
                setLlave1(true);
            }
            if(Tablero[5].equals("2")|| Tablero[7].equals("2")|| Tablero[7].equals("2")|| Tablero[5].equals("2")){
                setLlave2(true);
            }
            if(Tablero[5].equals("3")|| Tablero[7].equals("3")|| Tablero[7].equals("3")|| Tablero[5].equals("3")){
                setLlave3(true);
            }
            if(Tablero[5].equals("4")|| Tablero[7].equals("4")|| Tablero[7].equals("4")|| Tablero[5].equals("4")){
                setLlave4(true);
            }
            if(Tablero[5].equals("5")|| Tablero[7].equals("5") || Tablero[7].equals("5")|| Tablero[5].equals("5")){
                setLlave5(true);
            }
            if(Tablero[5].equals("6")|| Tablero[7].equals("6") || Tablero[7].equals("6")|| Tablero[5].equals("6")){
                setLlave6(true);
            }
            if(Tablero[5].equals("7") || Tablero[7].equals("7") || Tablero[7].equals("7")|| Tablero[5].equals("7")){
                setLlave7(true);
            }
            if(Tablero[5].equals("8")|| Tablero[7].equals("8") || Tablero[7].equals("8")|| Tablero[5].equals("8")){
                setLlave8(true);
            }

        }
    }

    public int getZero() {
        return position_0;
    }

}
