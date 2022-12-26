package javaclasses;



public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
       CustomerManager musteriyappici = new CustomerManager();//buranın ismi hep değişebilir(musteriyappici)
       CustomerManager musteriyappici2= new CustomerManager();
       musteriyappici=musteriyappici2;// bir tanesi görmezden gelinir
       musteriyappici.Add("kjsnckasjcnkasjcnaksjc");
       musteriyappici.Add();
       musteriyappici.Add(49586);

       int sayi1=10;
       int sayi2=20;
       sayi1=sayi2;  
       sayi2=30;              //stack de sayi1 sayi2 ye eşit diye okunur.bu yuzden cevap 20 olmustur.
       System.out.println(sayi1);

       int[] sayilar1= new int[]{1,2,3};
       int[] sayilar2= new int[]{9,8,7};
       sayilar2=sayilar1;
       sayilar1[0]=99;
       System.out.println(sayilar2[0]);





    }

}
