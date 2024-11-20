package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ChatServer implements Mediator {

    List<Person> participants = new ArrayList<Person>();

    @Override
    public void register(Person person) {
        participants.add(person);
    }

    @Override
    public void connectEmployees(Person fromPerson, Person toPerson, String msg) throws InterruptedException {
        //If the sender is a registered user
        if (participants.contains(fromPerson)) {
            //If the receiver is a registered user
            if (participants.contains(toPerson)) {

            } else {
                System.out.println(fromPerson.getName() + " posts " + msg + " at: " + LocalDateTime.now());
                Thread.sleep(1000);
                // Target receiver receives this message
                toPerson.receiveMessage(fromPerson, msg);
            }
        } else {
            System.out.println(fromPerson.getName() + ", you cannot send the message to " + toPerson.getName() + ".");
            System.out.println("He/She is not a registered user.");
        }

    }

    @Override
    public void displayDetail() {
        System.out.println("At present, the registered employees are:");
        for (Person person : participants) {
            System.out.println(person.getName());
        }
    }
}
