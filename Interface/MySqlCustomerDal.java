public class MySqlCustomerDal implements ICustomerDal,IRepository { // BİRDEN FAZLA SINIFTAN KALITIM ALABILIR.

    @Override
    public void Add() {
        System.out.println("MySql eklendi");

    } // eklemesi zorunludur.

}
