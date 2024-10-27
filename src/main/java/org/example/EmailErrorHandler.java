package org.example;

public class EmailErrorHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void HandleMessage(Message message) {
        if(message.text.contains("email")){
            if(message.text.contains("fax")){
                System.out.println("- EmailErrorHandler  " +
                        "fixed the email issue: "+message.text);
                System.out.println("-- Now FaxErrorHandler needs to cross verify it.");
                if(nextHandler != null){
                    nextHandler.HandleMessage(message);
                }
            }
            else{
                System.out.println("EmailErrorHandler processed the issue: "+message.text);
            }
        }
        // Neither a fax issue or an email issue.
        if(nextHandler != null){
            nextHandler.HandleMessage(message);
        }
    }

    @Override
    public void nextErrorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
