package com.sda.facade;

import com.sda.facade.model.Cart;
import com.sda.facade.model.Product;
import com.sda.facade.model.User;

public class API {

    private User user;
    private Cart cart;
    private Product product;

    public API(User user, Cart cart, Product product) {
        this.user = user;
        this.cart = cart;
        this.product = product;
    }

    public void login(){
        user.login();
    }

    public void register(){
        user.register();
    }

    public void getProducts(){
        cart.getItems();
    }

    public void getCategoryByName(String categoryName){
        product.getByCategory(categoryName);
    }

}
