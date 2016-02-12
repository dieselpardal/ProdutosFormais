package main.java.com.exercise;

public enum ProductType {
    FRAGILE {
        @Override
        public double calculate(Product product, Tax tax) {
            return product.getPrice() + tax.getFragileTax();
        }
    },
    OVERWEIGHT {
        @Override
        public double calculate(Product product, Tax tax) {
            return product.getPrice() + tax.getOverWeightTax();
        }
    };

    public abstract double calculate(Product product, Tax tax);
}