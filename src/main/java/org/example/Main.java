package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Chain of responsibility pattern demo ***");
        // Objects of the chains
        Handler faxHandler = new FaxErrorHandler();
        Handler emailHandler = new EmailErrorHandler();
        Handler unknownHandler = new UnknownErrorHandler();

        // The root handler
        Handler rootHandler;
        // Making the following chain
        // FaxErrorHandler -> EmailErrorHandler -> UnknownErrorHandler -> end
        rootHandler = faxHandler;
        rootHandler.nextErrorHandler(emailHandler);
        emailHandler.nextErrorHandler(unknownHandler);
        unknownHandler.nextErrorHandler(null);

        // Different error messages
        Message msg1 = new Message("The fax is going slow.");
        Message msg2 = new Message("The email is not reaching destination.");
        Message msg3 = new Message("Sometimes the BCC field is disabled in emails.");
        Message msg4 = new Message("The fax is not reaching destination.");
        Message msg5 = new Message("The email nor fax is working properly.");
        Message msg6 = new Message("Users cannot login into the system");

        System.out.println("Handling different types of errors.");
        System.out.println("\nError-1:");
        rootHandler.HandleMessage(msg1);
        System.out.println("\nError-2:");
        rootHandler.HandleMessage(msg2);
        System.out.println("\nError-3:");
        rootHandler.HandleMessage(msg3);
        System.out.println("\nError-4:");
        rootHandler.HandleMessage(msg4);
        System.out.println("\nError-5:");
        rootHandler.HandleMessage(msg5);
        System.out.println("\nError-6:");
        rootHandler.HandleMessage(msg6);
    }
}
