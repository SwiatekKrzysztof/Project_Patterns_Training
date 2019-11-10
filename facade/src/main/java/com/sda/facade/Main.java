package com.sda.facade;

import com.sda.facade.model.Cart;
import com.sda.facade.model.Product;
import com.sda.facade.model.User;

public class Main {

    public static void main(String[] args) {
        API api = new API(new User(), new Cart(), new Product());
        api.register();
        api.login();
        api.getCategoryByName("AGD");
    }
}
