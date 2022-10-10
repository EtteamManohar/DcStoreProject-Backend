package com.knf.dev.models;

import javax.persistence.*;

@Entity
@Table

public class Product {
    private String product_name;
    private int price;
    private int quantity;
    @Id
    @SequenceGenerator(name="product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "product_sequence"
    )
    private long id;
    private String image;

    public Product(String product_name, int price, long id, int quantity,String image) {
        this.product_name = product_name;
        this.price = price;
        this.id = id;
        this.quantity = quantity;
        this.image=image;

    }

    public Product() {

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}

