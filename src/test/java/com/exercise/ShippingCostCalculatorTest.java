package test.java.com.exercise;

import main.java.com.exercise.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ShippingCostCalculatorTest {

    @Test
    public void shouldComputeNoTaxes() {
        double expected = 10.0;
        Product product = new Product(expected);
        ShippingCostCalculator calculator = new ShippingCostCalculator(new FreeTax());
        calculator.calculateTax(product);
        calculator.calculateProvider(product);
        assertThat(product.getPrice(), is(expected));
    }

    @Test
    public void shouldComputeOnlyFagileTax() {
        FedexTax fedexTax = Mockito.mock(FedexTax.class);

        double fragileTax = 0.1;
        double price = 10;
        double freeTax = 1;
        double overweight = 0.0;
        double expected = price * freeTax + fragileTax  + overweight; //10.1

        Mockito.when(fedexTax.getFragileTax()).thenReturn(fragileTax);
        Mockito.when(fedexTax.getOverWeightTax()).thenReturn(overweight);
        Mockito.when(fedexTax.getTaxProvider()).thenReturn(freeTax);

        Product product = new Product(price, ProductType.FRAGILE);
        ShippingCostCalculator calculator = new ShippingCostCalculator(fedexTax);

        calculator.calculateTax(product);
        calculator.calculateProvider(product);

        assertThat(product.getPrice(), is(expected));

    }
    @Test
    public void shouldComputeFedExTaxwithFagileAndOverWeight() {
        FedexTax fedexTax = new FedexTax();

        double fragileTax = fedexTax.getFragileTax();
        double overweight = fedexTax.getOverWeightTax();
        double FedExTax = fedexTax.getTaxProvider();
        double price = 2;
        double expected = price * FedExTax + fragileTax  + overweight; //300.2

        Product product = new Product(price, ProductType.FRAGILE,ProductType.OVERWEIGHT);
        ShippingCostCalculator calculator = new ShippingCostCalculator(fedexTax);
        calculator.calculateTax(product);
        calculator.calculateProvider(product);

        assertThat(product.getPrice(), is(expected));

    }

    @Test
    public void shouldComputeShippingValueFedexTaxWithOutFagileAndOverWeight() {
        Product product = new Product(2.0);
        ShippingCostCalculator shipping = new ShippingCostCalculator(new FedexTax());
        shipping.calculateTax(product);
        shipping.calculateProvider(product);
        assertThat(product.getPrice(), is(0.2));

    }

    @Test
    public void shouldComputeShippingValueDHLTaxWithOutFagileAndOverWeight() {
        Product product = new Product(2.0);
        ShippingCostCalculator shipping = new ShippingCostCalculator(new DHLTax());
        shipping.calculateTax(product);
        shipping.calculateProvider(product);
        assertThat(product.getPrice(), is(0.5));

    }

    @Test
    public void shouldComputeShippingValueFreeTaxWithOutFagileAndOverWeight() {
        Product product = new Product(2.0);
        ShippingCostCalculator shipping = new ShippingCostCalculator(new FreeTax());
        shipping.calculateTax(product);
        shipping.calculateProvider(product);
        assertThat(product.getPrice(), is(2.0));

    }

}
