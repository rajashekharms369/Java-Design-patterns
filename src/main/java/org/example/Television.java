package org.example;

public class Television {

    PossibleState currentState;

    public PossibleState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PossibleState currentState) {
        this.currentState = currentState;
    }

    public Television() {
        // Starting with OffState
        this.currentState = new OffState();
    }

    public void executeOffButton(){
        System.out.println("You pressed the OFF button.");
        currentState.pressOffButton(this);
    }
    public void executeOnButton(){
        System.out.println("You pressed the ON button.");
        currentState.pressOnButton(this);
    }
    public void executeMuteButton(){
        System.out.println("You pressed the MUTE button.");
        currentState.pressMuteButton(this);
    }
}
