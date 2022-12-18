package JAVAPROJEKT.javaclasses;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        char not = 'D';

        switch (not) {
            case 'A':
                System.out.println("mukemmel:geçtiniz");
                break;
            case 'B':
                System.out.println("İDARE EDER:geçtiniz");
                break;
            case 'C':
                System.out.println("ZORLAYA ZORLAYA:geçtiniz");
                break;
            case 'D':
                System.out.println("AZ DAHA KALIYODUN:geçtiniz");
                break;
            case 'F':
                System.out.println("HAHAHAHHA:KALDIN!!!");
                break;
            default:
                System.out.println("gecersiz not girildi");

        }
    }
}
