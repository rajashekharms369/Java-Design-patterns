package org.example;

public class FaxErrorHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void HandleMessage(Message message) {
        if(message.text.contains("fax")){
            if(message.text.contains("email")){
                System.out.println("- FaxErrorHandler" +
                        "fixed the fax issue: "+message.text);
                System.out.println("- EmailErrorHandler needs to cross verify it.");
                if(nextHandler != null){
                    nextHandler.HandleMessage(message);
                }
            }
            else{
                System.out.println("FaxErrorHandler processed the issue: "+message.text);
            }
        }
        else{
            if(nextHandler != null){
                nextHandler.HandleMessage(message);
            }
        }
    }

    @Override
    public void nextErrorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}