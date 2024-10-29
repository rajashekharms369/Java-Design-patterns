package org.example;

public class RemoteControlInvoker {

    Command currentCommand, lastCommandPerformed;

    public void setCommand(Command command) {
        this.currentCommand = command;;
    }

    public void executeSelectedCommand() {
        currentCommand.executeCommand();
        lastCommandPerformed = currentCommand;
    }

    public void undoCommand(){
        lastCommandPerformed.undoPreviousCommand();
    }
}
