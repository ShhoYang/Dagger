package com.hao.myapplication.bean;

import javax.inject.Inject;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

public class Factory {

    Product product;
    Product2 product2;

    @Inject
    public Factory(Product product) {
        this.product = product;
    }

    //@Inject
    public Factory(Product2 product2) {
        this.product2 = product2;
    }

    public Product getProduct() {
        return product;
    }

    public Product2 getProduct2() {
        return product2;
    }
}
