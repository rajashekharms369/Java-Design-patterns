package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Iterator Design pattern ***");
        Department arts = new ArtsDepartment();
        Iterator artsIterator = arts.createIterator();
        System.out.println("Iterating over the arts subjects\n");
        while(artsIterator.hasNext()) {
            System.out.println(artsIterator.next());
        }
        //Moving back to first element
        System.out.println("The pointer moves to -> "+ artsIterator.currentItem());
    }
}