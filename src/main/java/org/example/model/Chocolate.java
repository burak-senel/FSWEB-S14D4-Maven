package org.example.model;

public class Chocolate extends ProductForSale{
    private double chocoRate;
    private String flavor;
    public Chocolate(String type, double price, String description, double chocoRate, String flavor) {
        super(type, price, description);
        this.chocoRate=chocoRate;
        this.flavor=flavor;
    }

    public double getChocoRate() {
        return chocoRate;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
     void showDetails() {
        System.out.println("Chocolate [Type: " + getType() + ", Price: " + getPrice() +
                ", Description: " + getDescription() +", Chocolate Rate: "+chocoRate+ ", Flavor: " + flavor + "]");
    }

}
