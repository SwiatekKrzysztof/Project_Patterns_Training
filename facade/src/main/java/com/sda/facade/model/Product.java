package com.sda.facade.model;

public class Product {

    public void getAll(){
        System.out.println("Returning all products");
    }

    public void getByCategory(String categoryName){
        System.out.println("Products from category: " + categoryName);
    }
}
