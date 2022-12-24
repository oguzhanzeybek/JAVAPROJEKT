package javaclasses;

public class CustomerManager {

    public void Add( String mesaj1) {
        
        System.out.println(mesaj1);
        
    }

    public void Add(){
        System.out.println("bos birakildiii");
    }
    
    public void Add(Integer sayi){//int-Integer
        System.out.println(sayi);
    }
    public void Add(boolean sayi){//boolean-Boolean
        System.out.println(sayi);
    }
    

    public void Remove() {
        System.out.println("müsteri silindi");
    }

    public void Update() {
        System.out.println("müsteri güncellendi");
    }

}