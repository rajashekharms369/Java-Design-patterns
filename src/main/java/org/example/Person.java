package org.example;

abstract class Person {
    protected Mediator mediator;

    protected String name;

    public String getName(){
        return name;
    }

    // Constructor
    public Person(Mediator mediator){
        this.mediator = mediator;
    }

    public void sendMessage(Person toEmp, String msg) throws InterruptedException{
        mediator.connectEmployees(this, toEmp, msg);
    }

    public abstract String personType();

    public void receiveMessage(Person fromEmp, String msg) throws InterruptedException{
        System.out.println(this.name+" has read "+fromEmp.getName()+"'s message.");
    }
}
