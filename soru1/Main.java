import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            scan.useLocale(Locale.US);
            System.out.println("cemberin yaricapini giriniz:");

            double yaricap = scan.nextDouble();
            System.out.println("cemberin yaricapi:"+yaricap);
            System.out.println("cemberin capi:"+yaricap*2);
            System.out.println("cemberin cevresi: pi."+yaricap*2 );
            System.out.println("cemberin alani: pi."+yaricap*+yaricap);
        }




    }
}