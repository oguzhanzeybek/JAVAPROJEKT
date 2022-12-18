package JAVAPROJEKT.javaclasses;

public class Main {

    public static void main(String[] args) {
        // İ=İ+1 == i++
        // i = i + 5 == i+=2
        // for(int i=1;i<90; i++){
        for (int i = 0; i <= 90; i += 2) {
            System.out.println(i);

        }
        System.out.println("for dongusu bitti");

        int i = 1;
        while(i<100){
            System.out.println(i);
            i+=5;
        } System.out.println(" while dongusu bitti");

    }

}
