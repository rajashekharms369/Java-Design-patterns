package org.example;

public class OnState implements PossibleState{
    public OnState() {
        System.out.println("The TV now is in On State");
    }

    // The TV is on, the u ser pressses the on button.
    @Override
    public void pressOnButton(Television tvContext) {
        System.out.println("The TV was already in ON state.");
        System.out.println("Ignoring the operation.");
    }

    @Override
    public void pressOffButton(Television tvContext) {
        System.out.println("The TV was in ON state");
        System.out.println("Turning the TV OFF");
        tvContext.setCurrentState(new OffState());
    }

    // The TV is already in the ON state. The user presses the mute button.
    @Override
    public void pressMuteButton(Television tvContext) {
        System.out.println("The TV was in ON state");
        System.out.println("Muting the TV");
        tvContext.setCurrentState(new MuteState());
    }

    @Override
    public String toString() {
        return " Switched On.";
    }
}
