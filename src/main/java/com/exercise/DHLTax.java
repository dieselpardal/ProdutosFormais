package main.java.com.exercise;

public class DHLTax implements Tax {

    private final double TAX = 0.25;
    private final double FRAGILE = 150;
    private final double OVERWEIGHT = 350;

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
