package com.prakash.tel1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.tel1.model.product;
import com.prakash.tel1.service.productService;

@RestController
public class productController {
    @Autowired
    productService service;

    @GetMapping("/pro")
    public List<product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/pro/{prodId}")
    public product geProductById(@PathVariable int prodId) {
        return service.geProductById(prodId);

    }

    @PostMapping("/pro")
    public void addproduct(@RequestBody product prod) {
        service.addproduct(prod);
    }

}
