package org.example;

public class GameStartCommand implements Command {

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void executeCommand() {
        System.out.println("The game is a bout to start.");
        game.start();
        game.displayScore();
    }

    @Override
    public void undoPreviousCommand() {
        System.out.println("Undoing the previous start command.");
        game.stop();
    }

}
