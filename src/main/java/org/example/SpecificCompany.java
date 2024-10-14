package org.example;

class SpecificCompany extends Company{

    public SpecificCompany(String name) {
        super(name);
    }

    @Override
    void register(Observer observer) {
        observersList.add(observer);
        System.out.println(this.getName()+" registers"+observer.getObserverName());
    }

    @Override
    void unRegister(Observer observer) {
        observersList.remove(observer);
        System.out.println(this.getName()+" unRegisters"+observer.getObserverName());
    }

    @Override
    void notifyRegisteredUsers() {
        for(Observer observer : observersList){
            observer.getNotifications(this);
        }
    }
}
