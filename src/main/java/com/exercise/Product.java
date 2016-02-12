package main.java.com.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Product {


    private double price;

    private List<ProductType> types = new ArrayList<>();

    public Product(double price, ProductType... types) {
        this.price = price;
        this.types.addAll(Arrays.asList(types));
   }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public List<ProductType> getTypes() {
        return Collections.unmodifiableList(this.types);
    }
}