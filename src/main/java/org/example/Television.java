package org.example;

class Television extends ElectronicItem{

    String productType;

    double cost;

    public Television(PriceType priceType) {
        super(priceType);
        this.productType = "Television";
        this.cost = 2000;
    }
    /*
    Implementaion specific:
    we are delegating the implementation.
    to the implementor Object
     */
    @Override
    protected void showPriceDetail() {
        priceType.displayProductPrice(productType, cost);
    }
}
