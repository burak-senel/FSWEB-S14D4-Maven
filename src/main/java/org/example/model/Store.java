package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Dark Chocolate", 2.5, "Rich dark chocolate",30,"Bitter");
        products[1] = new Coke("Coca Cola", 1.0, "Refreshing beverage", 0.5);
        products[2] = new Bread("Whole Wheat Bread", 3.0, "Healthy whole wheat bread", "Large");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}