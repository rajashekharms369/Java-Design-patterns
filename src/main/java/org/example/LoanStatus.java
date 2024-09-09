package org.example;

public class LoanStatus {
    public boolean hasPreviousLoans(Persom person){
        System.out.println("Verifying "+person.name+"'s previous loans status.");
        return person.previousLoanExists ? true : false;
    }
}
