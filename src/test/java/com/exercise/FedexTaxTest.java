package test.java.com.exercise;
import main.java.com.exercise.FedexTax;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FedexTaxTest {

    @Test
    public void shouldComputeTaxCorrectlyFedexStrategy () {
        FedexTax checkFedexTax = new FedexTax();
        assertThat(checkFedexTax.getTaxProvider(), is(0.1));
    }

    @Test
    public void shouldComputeFragileFedexStrategy () {
        FedexTax fragileFedexTax = new FedexTax();
        assertThat(fragileFedexTax.getFragileTax(), is(100.0));
    }

    @Test
    public void shouldComputeOverWeightFedexStrategy () {
        FedexTax overWeightFedexTax = new FedexTax();
        assertThat(overWeightFedexTax.getOverWeightTax(), is(200.0));
    }



}
