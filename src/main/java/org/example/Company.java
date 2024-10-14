package org.example;

import java.util.ArrayList;
import java.util.List;

abstract class Company {
    List<Observer> observersList = new ArrayList<>();

    // Name of the subject
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // For the stock price
    private int stockPrice;

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        notifyRegisteredUsers();
    }

    // To Register an observer
    abstract void register(Observer observer);

    // To Unregister an observer
    abstract void unRegister(Observer observer);

    // To notify registered users
    abstract void notifyRegisteredUsers();

}
