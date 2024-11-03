package org.example;

public class OffState implements PossibleState{

    public OffState(){
        System.out.println("The TV is off now.\n");
    }

    // TV was off, the user presses the on button.
    @Override
    public void pressOnButton(Television tvContext) {
        System.out.println("The TV was off. Going from Off state to On state.");
        tvContext.setCurrentState(new OnState());
    }

    // TV was off. The user presses the off buttonn. nothing happens
    @Override
    public void pressOffButton(Television tvContext) {
        System.out.println("The TV was already in the off state.");
        System.out.println("So, ignoring this operation.");
    }

    @Override
    public void pressMuteButton(Television tvContext) {
        System.out.println("The TV was already in the off state");
        System.out.println("So, ignoring this operation.");
    }

    @Override
    public String toString(){
        return "Switched off";
    }
}
