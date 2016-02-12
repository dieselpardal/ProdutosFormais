package main.java.com.exercise;

public class FreeTax implements Tax {

    private final double TAX = 1;
    private final double ZERO = 0;
    @Override
    public double getTaxProvider() {
        return TAX;
    }

    @Override
    public double getFragileTax() {
        return ZERO;
    }

    @Override
    public double getOverWeightTax() {
        return ZERO;
    }
}
