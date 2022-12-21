package JAVAPROJEKT.javaclasses;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int number = 1;
        if(number<1){
            System.out.println("gecersiz sayi");
            return;
        }
        if(number==1){
            System.out.println("sayi asal degildir");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;

            }

        }
        if (isPrime) {
            System.out.println("sayi asaldir");
        } else {
            System.out.println("sayi asal degildir");
        }
        

    }

}
