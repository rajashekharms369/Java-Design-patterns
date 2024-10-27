package org.example;

public class UnknownErrorHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void HandleMessage(Message message) {
        if(!(message.text.contains("fax")) || !(message.text.contains("email"))) {
            System.out.println("An unknown error occurs. Consult experts immediately.");
        } else if (nextHandler != null) {
            nextHandler.HandleMessage(message);
        }
    }

    @Override
    public void nextErrorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
