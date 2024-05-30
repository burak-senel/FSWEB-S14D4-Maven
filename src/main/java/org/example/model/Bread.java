package org.example.model;

public class Bread extends ProductForSale{
    private String size;

    public Bread(String type, double price, String description, String size) {
        super(type, price, description);
        this.size = size;
    }

    public String getSize() {
        return size;
    }


    @Override
    void showDetails() {
        System.out.println("Bread [Type: " + getType() + ", Price: " + getPrice() +
                ", Description: " + getDescription() + ", Size: " + size + "]");
    }

}
