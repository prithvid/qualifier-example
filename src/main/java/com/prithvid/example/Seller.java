package com.prithvid.example;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: prithvi
 * Date: 7/30/12
 * Time: 1:53 AM
 */

@Named
@RequestScoped
public class Seller {

    @Inject
    @Special
    Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}
