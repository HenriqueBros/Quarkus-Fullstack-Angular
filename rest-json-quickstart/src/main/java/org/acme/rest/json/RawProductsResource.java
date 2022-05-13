package org.acme.rest.json;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/raw-products")
public class RawProductsResource {
    private Set<RawProduct> rawproducts = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public RawProductsResource() {
        rawproducts.add(new RawProduct("Sand",5, 1000));
        rawproducts.add(new RawProduct("Iron",100, 50));
        rawproducts.add(new RawProduct("Stone",35, 750));
    }

    @GET
    public Set<RawProduct> list() {
        return rawproducts;
    }

    @POST
    public Set<RawProduct> add(RawProduct rawproduct) {
        rawproducts.add(rawproduct);
        return rawproducts;
    }

    @DELETE
    public Set<RawProduct> delete(Product product) {
        rawproducts.removeIf(existingProduct -> existingProduct.name.contentEquals(product.name));
        return rawproducts;
    }
}
