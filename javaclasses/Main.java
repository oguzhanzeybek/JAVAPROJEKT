package JAVAPROJEKT.javaclasses;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        sayibulmaca();

    }

    public static void sayibulmaca() {
        int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int aranan = 8;
        boolean varMiAcaba = false;

        for (int sayi : sayilar) {
            if (sayi == aranan) {
                varMiAcaba = true;

            }

        }

        if (varMiAcaba) {
            mesajver("aranan sayi listede: "+aranan);

        } else {
            mesajver("aranan sayi listede degil: : "+aranan);

        }

    }

    public static void mesajver(String mesaj){
        System.out.println(mesaj); 
    }

}
