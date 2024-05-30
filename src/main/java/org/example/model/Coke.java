package org.example.model;

public class Coke extends ProductForSale{
    private double sugarRate;

    public Coke(String type, double price, String description, double sugarRate) {
        super(type, price, description);
        this.sugarRate = sugarRate;
    }

    public double getSugarRate() {
        return sugarRate;
    }
    @Override
    void showDetails() {
        System.out.println("Coke [Type: " + getType() + ", Price: " + getPrice() +
                ", Description: " + getDescription() + ", Sugar Rate: " + sugarRate + "L]");
    }
}
