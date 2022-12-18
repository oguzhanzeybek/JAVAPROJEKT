package JAVAPROJEKT.javaclasses;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
       int sayi1 =99;
       int sayi2 = 66;
       int sayi3 = 33;
       int enBüyükSayi = sayi1;

       if(enBüyükSayi <sayi2 ){
       enBüyükSayi=sayi2;
       };
       if(enBüyükSayi<sayi3){
       enBüyükSayi=sayi3;
       }
      System.out.println("en buyuk sayi=" +enBüyükSayi );
        
    }
}
