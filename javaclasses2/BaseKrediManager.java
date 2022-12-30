public class BaseKrediManager {
    public final double hesapla(double tutar) {
     return tutar * 1.18;//1.18 faiz oranimiz.
    }
}
//final kullanılırsa ustune yazılamaz.OgrenciKrediManagerda oldugu gıbı hata verır.