package JAVAPROJEKT.javaclasses;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                toplam1 = toplam1 + i; // bu sayede her fpr döngüsünde sayıyı toplama eklemiş oluyoruz

            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                toplam2 = toplam2 + i; // bu sayede her fpr döngüsünde sayıyı toplama eklemiş oluyoruz

            }
        }

        if (number1 == toplam2 && number2 == toplam1) {
            System.out.println("arkadas sayidir");
        } else {
            System.out.println("arkadas sayi degildir");
        }

    }

}
