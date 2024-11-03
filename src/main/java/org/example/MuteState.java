package org.example;

public class MuteState implements PossibleState{

    public MuteState(){
        System.out.println("The TV is in Mute mode now.\n");
    }

    // The TV is muted, so on pressing the on button, moving to the normal state.
    @Override
    public void pressOnButton(Television tvContext) {
        System.out.println("The TV was in mute mode.");
        System.out.println("So moving to the normal state.");
        tvContext.setCurrentState(new OnState());
    }

    // TV is muted, but the user presses the Off button
    @Override
    public void pressOffButton(Television tvContext) {
        System.out.println("The TV was in mute mode.");
        System.out.println("So now switching OFF the TV.");
        tvContext.setCurrentState(new OffState());
    }

    // TV is muted, but the user prese the mute button again.
    @Override
    public void pressMuteButton(Television tvContext) {
        System.out.println("The TV was in mute mode.");
        System.out.println("So ignoring this operation.");
    }

    @Override
    public String toString(){
        return "Mute mode.";
    }
}
