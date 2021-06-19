package com.stock.spring.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_INFO")
public class product {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String getDescription() {
        return description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_DESCRIPTION")
    private String description;
    @Column(name = "PRODUCT_PRICE")
    private int price;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "PRODUCT_quantity")
    private int quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return productName;
    }

    public void setFirstName(String firstName) {
        this.productName = productName;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        product product = (product) obj;
        if (productName != null ?
                !productName.equals(product.productName)
                : product.productName != null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "product [id="
                + id
                + ", name="
                + productName
                + " "
                + description
                + "]";
    }
}