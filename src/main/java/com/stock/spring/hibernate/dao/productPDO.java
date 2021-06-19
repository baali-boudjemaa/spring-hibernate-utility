package com.stock.spring.hibernate.dao;

import com.stock.spring.hibernate.model.Person;
import com.stock.spring.hibernate.model.product;

import java.util.List;

public interface productPDO {
    public List<Person> getAllProducts();

    public void insertProduct (product product);
    public product getProduct(int id);
}
