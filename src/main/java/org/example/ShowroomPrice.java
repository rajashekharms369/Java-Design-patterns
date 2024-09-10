package org.example;

class ShowroomPrice implements PriceType{
    @Override
    public void displayProductPrice(String productType, double cost){
        System.out.println("The "+productType+"'s showroom price is $"+cost);
    }
}
