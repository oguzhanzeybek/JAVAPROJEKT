package JAVAPROJEKT.javaclasses;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int number = 1;
        int toplam = 0;
        if(number==1){
            System.out.println( "mukemmel sayidir >>> "+number);
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam = toplam + i; // bu sayede her fpr döngüsünde sayıyı toplama eklemiş oluyoruz

            }
        }
        if(number==toplam){
            System.out.println( "mukemmel sayidir >>> "+number);
        }else{
            System.out.println( "mukemmel sayidir degildir >>> "+number);
        }

    }

}
