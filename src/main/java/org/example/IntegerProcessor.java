package org.example;

public class IntegerProcessor implements NumberProcessor {

    // The flag is final. once initialized.
    // It should not be changed
    private final int number;

    public IntegerProcessor() {
        this.number = 5;
    }

    public int getNumber(){
        return number;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitNumber(this);
    }
}
