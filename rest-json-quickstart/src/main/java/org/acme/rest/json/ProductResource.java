package org.acme.rest.json;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import static java.lang.Math.random;

@Path("/products")
public class ProductResource {

    private Set<Product> products = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public ProductResource() {
        products.add(new Product("Cement",20, 100));
        products.add(new Product("Nail",5, 500));
    }

    @GET
    public Set<Product> list() {
        return products;
    }

    @POST
    public Set<Product> add(Product product) {
        products.add(product);
        return products;
    }

    @DELETE
    public Set<Product> delete(Product product) {
        products.removeIf(existingProduct -> existingProduct.name.contentEquals(product.name));
        return products;
    }
}