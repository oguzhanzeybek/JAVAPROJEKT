public class Main {

    public static void main(String[] args) {
        Product product = new Product(1);
        product.name = "Laptop";

        ProduckManager produckManager = new ProduckManager();
        produckManager.Add(product);
    }

}
