package test.java.com.exercise;
import main.java.com.exercise.FreeTax;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FreeTaxTest {

    @Test
    public void shouldComputeTaxCorrectlyFreeStrategy () {
        FreeTax checkFreeTax = new FreeTax();
        assertThat(checkFreeTax.getTaxProvider(), is(1.0));
    }

    @Test
    public void shouldComputeFragileFreeStrategy () {
        FreeTax fragileFreeTax = new FreeTax();
        assertThat(fragileFreeTax.getFragileTax(), is(0.0));
    }

    @Test
    public void shouldComputeOverWeightFreeStrategy () {
        FreeTax overWeightFreeTax = new FreeTax();
        assertThat(overWeightFreeTax.getOverWeightTax(), is(0.0));
    }
}
