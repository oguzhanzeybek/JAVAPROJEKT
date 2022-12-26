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

    }

}
