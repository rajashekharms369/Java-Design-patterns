package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Visitor pattern demonstration-1. ***");
        NumberProcessor targetInteger = new IntegerProcessor();

        System.out.println("Testing the incrementor visitor now.");
        Visitor visitor = new IncrementorVisitor();
        targetInteger.acceptVisitor(visitor);

        System.out.println("\n*** Testing the DoubleMakerVisitor now. ***");
        visitor = new DoubleMakerVisitor();
        targetInteger.acceptVisitor(visitor);
    }
}
