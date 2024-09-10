package org.example;

public class Main {
    public static void main(String[] args) {
        // Bridge deisgn pattern
        System.out.println("*** Bridge Pattern Demo ***");

        System.out.println("Verifying the market price of a television");

        //Verifying online price
        ElectronicItem eItem = new Television(new OnlinePrice());

        eItem.showPriceDetail();

        eItem = new Television(new ShowroomPrice());
        eItem.showPriceDetail();
    }
}
