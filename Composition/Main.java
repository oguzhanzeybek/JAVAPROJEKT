public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "aloooooooooooooo";
        product.preis = 98435;
        product.id = 1;
        manager.add(product);
        //DataBaseHelper.Crud.delete(); şeklinde innercasslar kullanılır.
    }
}// static de olusan nesne kullanıldıktan sonra atılmaz.bu yuzden olavildiignce
 // az kullan.static yapılırsa bir sınıf class ısmıyle cagrılabılır