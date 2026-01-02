package org.example.model;

public class Chocolate extends ProductForSale {

    private int cocoaRate;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.cocoaRate = 70;
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Chocolate -> Type: " + getType() +
                        ", Price: " + getPrice() +
                        ", Description: " + getDescription() +
                        ", Cocoa Rate: " + cocoaRate
        );
    }
}
