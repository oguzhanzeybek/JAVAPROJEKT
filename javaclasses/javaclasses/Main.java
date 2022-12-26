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




    }

}
