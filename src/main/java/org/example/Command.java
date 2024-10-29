package org.example;

public interface Command {
    void executeCommand();
    void undoPreviousCommand();
}
