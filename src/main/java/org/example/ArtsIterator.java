package org.example;

public class ArtsIterator implements Iterator {

    private String[] subjects;

    private int currentPointer;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        currentPointer = 0;
    }

    @Override
    public void first() {
        currentPointer = 0;
    }

    @Override
    public String next() {
        return subjects[currentPointer++];
    }

    @Override
    public String currentItem() {
        return subjects[currentPointer];
    }

    @Override
    public boolean hasNext() {
        if(currentPointer < subjects.length) {
            return true;
        }
        return false;
    }
}
