public class Main {
    public static void main(String[] args) {

        //ICustomerDal customerDal=new ICustomerDal(); şeklinde calısmaz.
        ICustomerDal customerDal=new OracleCustomerDal(); //SEKLİNDE CALISIR.
        customerDal.Add();

    }
}