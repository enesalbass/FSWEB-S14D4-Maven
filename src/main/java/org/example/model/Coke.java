package org.example.model;

public class Coke extends ProductForSale {

    private boolean sugarFree;

    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.sugarFree = false;
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Coke -> Type: " + getType() +
                        ", Price: " + getPrice() +
                        ", Description: " + getDescription() +
                        ", Sugar Free: " + sugarFree
        );
    }
}
