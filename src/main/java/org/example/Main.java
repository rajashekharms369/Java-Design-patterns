package org.example;

public class Main {
    public static void main(String[] args) {
        // State pattern
        System.out.println("*** State pattern demonstration ***");
        // TV is initialized with off state.
        Television tv = new Television();
        System.out.println("The User is pressin the buttons in the following sequence");

        System.out.println("Off->Mute->On->On->Mute->Mute->On->Off\n");

        // TV is off. Pressing the off button again.
        tv.executeOffButton();

        // Checking the current State
        System.out.println("Checking the current state: " + tv.getCurrentState());

        // Switching on the TV.
        tv.executeOnButton();

        // Checkiing the current state
        System.out.println("Checking the current state: " + tv.getCurrentState());

        // Pressing the ON button again when the TV is on.
        tv.executeOnButton();
        // Putting the TV in mute mode
        tv.executeMuteButton();

        // Checking the current State
        System.out.println("Checking the current state: " + tv.getCurrentState());

        // TV is silent now. Pressing the on button.
        tv.executeOnButton();

        // Switching off the TV now.
        tv.executeOffButton();

        System.out.println("Checking the current state: " + tv.getCurrentState());a
    }
}
