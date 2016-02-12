package test.java.com.exercise;  // ESSE EH CODIGO PRINCIPAL - DEVEMOS 3 ASSERT' POR UM METODO

import main.java.com.exercise.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShippingAppTest {

    @Test
    public void shouldTestShippingApp() {

        Product umProduto = new Product(1000, ProductType.FRAGILE,ProductType.OVERWEIGHT);

        ShippingCostCalculator calculatorFedEx = new ShippingCostCalculator(new FedexTax());

        calculatorFedEx.calculateTax(umProduto);

        calculatorFedEx.calculateProvider(umProduto);

        assertThat(umProduto.getPrice(), is(400.0));


    }

}
