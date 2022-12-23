package JAVAPROJEKT.javaclasses;



public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String mesaj="bugun hava cok guzel";
        System.out.println(mesaj);
        String yenimesaj=sehirVer();
        System.out.println(yenimesaj);
        int sayi =topla(2,4);
        System.out.println(sayi);
    }
    public static void ekle(){
        System.out.println("eklendi");

    }
    public static void sil(){
        System.out.println("silindi");
    }
    public static void guncelle(){
        System.out.println("guncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
        
    }
    public static String sehirVer(){
        return "Karaman";
        
    }

}
