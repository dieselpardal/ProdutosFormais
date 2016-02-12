package main.java.com.exercise;

public class FedexTax implements Tax {

    private final double TAX = 0.1;
    private final double FRAGILE = 100;
    private final double OVERWEIGHT = 200;

    @Override
    public double getTaxProvider() {
        return TAX;
    }

    @Override
    public double getFragileTax() {
        return FRAGILE;
    }

    @Override
    public double getOverWeightTax() {
        return OVERWEIGHT;
    }
}

