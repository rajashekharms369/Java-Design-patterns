package org.example;

class OnlinePrice implements PriceType{

    @Override
    public void displayProductPrice(String productType, double cost){
        System.out.println("The "+productType+"'s online price is $"+cost*.9);
    }
}
