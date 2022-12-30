public class ProductValidator {
    public boolean isValid(Product product) {
        if (product.preis > 0 && product.name.isEmpty()) {
            return true;
        }
        return false;
    }
}
