package org.acme.rest.json;

public class Product {
    public String name;
    public Number value;
    public Number quantity;

    public Product() {
    }

    public Product( String name, Number value, Number quantity) {
        this.name = name;
        this.value= value;
        this.quantity = quantity;
    }
}
