package org.example;

public class Originator {

    private String state;

    public void setState(String newState){
        state = newState;
        System.out.println("The current state is: " + state);
    }

    // Back to an old state (Restore)
    public void rewtore(Memento memento){
        this.state = memento.state;
        System.out.println("Restored to state: " + state);
    }

    // Originator which contains its current state
    // will supply the memento in response to the caretakes request
    public Memento getMemento(){
        Memento currentMemento = new Memento(state);
        return currentMemento;
    }
}
