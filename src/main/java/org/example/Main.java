package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Command pattern demonstration ***");
        // Receiver
        Game gameName = new Game("Golf");
        // Command Objects
        // Command to start the game
        GameStartCommand gameStartCommand = new GameStartCommand(gameName);
        // Command to stop the game
        GameStopCommand gameStopCommand = new GameStopCommand(gameName);

        // Invoker
        RemoteControlInvoker remoteControlInvoker = new RemoteControlInvoker();
        System.out.println("--- Testing Scenario 1 ---\n");
        System.out.println("Starting a game using the command");
        remoteControlInvoker.setCommand(gameStartCommand);
        remoteControlInvoker.executeSelectedCommand();
        System.out.println("\nUndoing the previous command now.");
        remoteControlInvoker.undoCommand();

        System.out.println("-- Testing Scenario 2 ---\n");

        System.out.println("Starting the game again");
        remoteControlInvoker.setCommand(gameStartCommand);
        remoteControlInvoker.executeSelectedCommand();
        System.out.println("\nIssueing a stop command now.");
        remoteControlInvoker.setCommand(gameStopCommand);
        remoteControlInvoker.executeSelectedCommand();
        System.out.println("\nUndoing the previous command now");
        remoteControlInvoker.undoCommand();
    }
}
