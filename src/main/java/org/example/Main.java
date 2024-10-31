package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static Originator originator;
    static List<Memento> savedMementos;

    public static void main(String[] args) {
        System.out.println("*** Memento Design pattern demo-1 ***");
        originator = new Originator();

        // This list stores the checkpoints
        savedMementos = new ArrayList<>();
        // Snapshot #0
        saveSnapShot(originator, "Snapshot #0", savedMementos);
        // Snapshot #1
        saveSnapShot(originator, "Snapshot #1", savedMementos);
        // Snapshot #2
        saveSnapShot(originator, "Snapshot #2", savedMementos);
        // Snapshpt #3
        saveSnapShot(originator, "Snapshot #3", savedMementos);
        // Snapshot #4 taking a snapshot but not adding as a restore point
        originator.setState("Snapshot #4");

        // Undo's Rollback everything
        System.out.println("\nStarted restoring process...");
        for(int i=1; i<savedMementos.size(); i++){
            originator.rewtore(savedMementos.get(i));
        }

        // Restoring to any specified checkpoint
        System.out.println("\nRestoring to SnapShot #1");
        originator.rewtore(savedMementos.get(1));

    }

    public static void saveSnapShot(Originator originator, String checkpoint, List<Memento> savedMementos) {
        // Setting a new state
        originator.setState(checkpoint);
        // Get the current state from the originator through a memento
        Memento memento = originator.getMemento();
        System.out.println("Saving this checkpoint.");
        savedMementos.add(memento);
    }


}