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
        int toplam=topla2(1,23,4,5,56,33);
        System.out.println(toplam);
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
    public static int topla2(int... sayilar){
       int toplam=0;
       for(int sayi:sayilar){
        toplam+=sayi;
       }
        return toplam;
    }

}
