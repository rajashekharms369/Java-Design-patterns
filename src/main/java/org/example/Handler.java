package org.example;

public interface Handler {
    void HandleMessage(Message message);
    void nextErrorHandler(Handler nextHandler);
}
