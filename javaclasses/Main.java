package JAVAPROJEKT.javaclasses;

public class Main {

    public static void main(String[] args) {
        String mesaj = "bugun hava cok sicak";

        System.out.println(mesaj);

        System.out.println("eleman sayisi:" + mesaj.length());
        System.out.println("5.eleman:" + mesaj.charAt(4));
        System.out.println(mesaj.concat(",yasaaaaaaaaaaasin mi acaba?"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("A"));
        System.out.println(mesaj.endsWith("k"));

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("a"));// ilk buldugunu getirir
        System.out.println(mesaj.lastIndexOf("k")); 

    }

}
