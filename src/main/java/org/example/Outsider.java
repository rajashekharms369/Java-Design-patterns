package org.example;

public class Outsider extends Person {

    // Constructor
    public Outsider(Mediator mediator, String name){
        super(mediator);
        this.name = name;
    }

    @Override
    public String personType() {
        return "Outsider";
    }
}
