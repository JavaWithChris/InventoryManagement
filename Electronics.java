public class Electronics extends Product {
    public Electronics(String productId, String name, double price, int quantity) {
        super(productId, name, price, quantity);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
