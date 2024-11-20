package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Mediator deisgn pattern
        System.out.println("*** Mediator Pattern demo-1 ***\n");
        ChatServer mediator = new ChatServer();

        Person amit = new Employee(mediator, "Amit");
        Person sohel = new Employee(mediator, "Sohel");
        Person joseph = new Employee(mediator, "Joseph");

        // Registering participants
        mediator.register(amit);
        mediator.register(sohel);
        mediator.register(joseph);

        // Displaying the participant's list
        mediator.displayDetail();

        System.out.println("Communication starts among participants...");
        amit.sendMessage(sohel, "Hi sohel, can we discuss the mediator pattern");
        amit.sendMessage(joseph, "Hi joseph, how do you do.");
        sohel.sendMessage(amit, "Hi amit, we can discuss now.");
        joseph.sendMessage(amit, "Hello friend.");

        // Another employee Todd, he does not register to the mediator.
        Person todd = new Employee(mediator, "Todd");
        //Todd is an employee, but not a registered user. so he cannot send message to the registered user. For the same
        // reason he cannot receive any message from the registered user.

        todd.sendMessage(joseph, "Hello joseph,,,");
        amit.sendMessage(todd, "Hello todd");

        // An outsider person tries to participate.
        Person jack = new Outsider(mediator, "Jack");
        // This message also cannot reach joseph because he is not a registered user.
        jack.sendMessage(joseph, "Hello joseph,,,");


        System.out.println("Hello world");
    }
    public int lengthOfLastWord(String s) {
        String[] strArray = s.split(" ");
        return strArray[strArray.length-1].length();
    }
}