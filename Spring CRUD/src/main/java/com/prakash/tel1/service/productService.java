package com.prakash.tel1.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.prakash.tel1.model.product;

@Component
public class productService {

    List<product> Products = new ArrayList<>((
            new product("oneplus", 1, 25000),
            new product("Dell", 2, 22000),
            new product("Boult", 3, 15000)
            ));

    public List<product> getProducts() {
        return Products;
    }

    // *************** get products by Id one by one
    public product geProductById(int prodId) {
        return Products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }

    // ******************if we put wrong or ilatha prodid it will show zero */
    // public product geProductById(int prodId) {
    // return Products.stream()
    // .filter(p -> p.getProdId() == prodId)
    // .findFirst().orElse(new product("no", 00, 00));
    // }
    public void addproduct(product prod) {
        Products.add(prod);

    }

}
