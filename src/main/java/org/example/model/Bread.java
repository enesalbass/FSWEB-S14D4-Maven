package org.example.model;

public class Bread extends ProductForSale {

    private String flourType;

    public Bread(String type, int price, String description) {
        super(type, price, description);
        this.flourType = "Wheat";
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Bread -> Type: " + getType() +
                        ", Price: " + getPrice() +
                        ", Description: " + getDescription() +
                        ", Flour: " + flourType
        );
    }
}
