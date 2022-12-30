public class ProductValidator {
    static{
        System.out.println("static bok calisti");
    }
    public static boolean isValid(Product product) {
        if (product.preis > 0 && !product.name.isEmpty()) { // ! degilse demek
            return true;
        }
        return false;
    }
    public static class altclass{
        public static void sil(){} // seklinde clas ıcındekı clasa static verilir ama usttekıne verılmez.(inner class)

    }
}
