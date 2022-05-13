package org.acme.rest.json;

public class RawProduct {
    public String name;
    public Number value;
    public Number quantity;

    public RawProduct() {
    }

    public RawProduct( String name, Number value, Number quantity) {
        this.name = name;
        this.value= value;
        this.quantity = quantity;
    }
}
