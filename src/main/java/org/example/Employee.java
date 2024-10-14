package org.example;

public class Employee implements Observer{

    String nameOfObserver;

    public Employee(String nameOfObserver){
        this.nameOfObserver = nameOfObserver;
    }

    @Override
    public void getNotifications(Company company) {
        System.out.println(nameOfObserver+" has received an alert from "+ company.getName());
        System.out.println("The current stock price is: $"+company.getStockPrice());
    }

    @Override
    public String getObserverName() {
        return nameOfObserver;
    }
}
