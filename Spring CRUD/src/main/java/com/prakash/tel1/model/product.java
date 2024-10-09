package com.prakash.tel1.model;

import org.springframework.stereotype.Component;

@Component
public class product {
    private String prodName;
    private int prodId;
    private int price;

    public product() {
    }

    public product(String prodName, int prodId, int price) {
        this.prodName = prodName;
        this.prodId = prodId;
        this.price = price;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public int getPrice() {
        return price;
    }

}
