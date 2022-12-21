package JAVAPROJEKT.javaclasses;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int aranan = 8;
        boolean varMiAcaba = false;

        for (int sayi : sayilar) {
            if (sayi == aranan) {
                varMiAcaba = true;
                
            }
          

        }
        
        if (varMiAcaba) {
            System.out.println("aranan sayi listede");
            
        } else {
            System.out.println("aranan sayi listede yok");
            
        }
    }

}
