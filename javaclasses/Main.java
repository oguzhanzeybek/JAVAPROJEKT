package JAVAPROJEKT.javaclasses;

public class Main {

    public static void main(String[] args) {
        String[][] sayi = new String[3][3];

        sayi[0][0]= "1";
        sayi[0][1]= "2";
        sayi[0][2]= "3";
        sayi[1][0]= "4";
        sayi[1][1]= "5";
        sayi[1][2]= "6";
        sayi[2][0]= "7";
        sayi[2][1]= "8";
        sayi[2][2]= "9";

        for(int i =0; i<=2; i++){
            System.out.println("__________   ___________");
            for(int j=0; j<=2; j++){
                System.out.println(sayi[i][j]);
            }
        }


    }


}
