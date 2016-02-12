package main.java.com.exercise;

public class ShippingCostCalculator {

    private final Tax provider;

    public ShippingCostCalculator(Tax provider) {
        this.provider = provider;
    }

    public void calculateTax(Product product) {
        product.setPrice(product.getPrice() * provider.getTaxProvider());
    }

    public void calculateProvider(Product product) {
        product.getTypes().forEach(type -> {
            product.setPrice(type.calculate(product, provider));
        });
    }
}
