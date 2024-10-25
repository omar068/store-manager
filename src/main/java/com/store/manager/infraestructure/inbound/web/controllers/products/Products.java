package com.store.manager.infraestructure.inbound.web.controllers.products;

import lombok.Data;

@Data
public class Products {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String category;

    public Products(int id, String name, String description,
                    double price, int stock, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }
}
