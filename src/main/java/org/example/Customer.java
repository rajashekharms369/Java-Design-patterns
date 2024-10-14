package org.example;

public class Customer implements Observer{

    String nameOfObserver;

    public Customer(String nameOfObserver){
        this.nameOfObserver = nameOfObserver;
    }

    @Override
    public void getNotifications(Company company) {
        System.out.println(nameOfObserver+" is notified from "+company.getName());
        System.out.println("Its current stock price is: $"+company.getStockPrice());
    }

    @Override
    public String getObserverName() {
        return nameOfObserver;
    }
}
