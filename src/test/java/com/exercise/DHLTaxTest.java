package test.java.com.exercise;
import main.java.com.exercise.DHLTax;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DHLTaxTest {

    @Test
    public void shouldComputeTaxCorrectlyDHLStrategy () {
        DHLTax checkDHLTax = new DHLTax();
        assertThat(checkDHLTax.getTaxProvider(), is(0.25));
    }

    @Test
    public void shouldComputeFragileDHLStrategy () {
        DHLTax fragileDHLTax = new DHLTax();
        assertThat(fragileDHLTax.getFragileTax(), is(150.0));
    }

    @Test
    public void shouldComputeOverWeightDHLStrategy () {
        DHLTax overWeightDHLTax = new DHLTax();
        assertThat(overWeightDHLTax.getOverWeightTax(), is(350.0));
    }
}
