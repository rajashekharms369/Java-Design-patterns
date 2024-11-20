package org.example;

public interface Mediator {
    // To register an employee
    void register(Person person);

    // To send a message from one employee to another
    void connectEmployees(Person fromPerson, Person toPerson, String msg) throws InterruptedException;

    //To display currently registered members
    void displayDetail();

}