package JAVAPROJEKT.javaclasses;

public class Main {

    public static void main(String[] args) {
       double[] mylist={1.2,1.3,1.4,1.5,1.6};
       double total=0;

       for(double number:mylist){
        total=total + number;
        System.out.println(number);
       }
       System.out.println("toplam:"+total);

    }
}
