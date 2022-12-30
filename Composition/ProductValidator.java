public class ProductValidator {
    public static boolean isValid(Product product) {
        if (product.preis > 0 && !product.name.isEmpty()) { // ! degilse demek
            return true;
        }
        return false;
    }
}
