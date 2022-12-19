package JAVAPROJEKT.javaclasses;

public class Main {

    public static void main(String[] args) {
       double[] mylist={1.2,1.3,1.4,1.5,1.6};
       double total=0;
       double max=mylist[0];

       for(double number:mylist){
        if(max<number){
            max =number;
        }
        total=total + number;
        System.out.println(number);
       }
       System.out.println("toplam:"+total);
       System.out.println("EN BUYUK SAYI:"+max);

    }
}
