package org.example;

public class Main {
    public static void main(String[] args) {
        // Facade deisgn pattern
        Persom person1 = new Persom("Bob", 5000, true);
        Persom person2 = new Persom("Jack", 70000, false);
        Persom person3 = new Persom("Tony", 125000, true);

        System.out.println("*** Simplifying the usage of a complex system using a facade. ***");

        //Using a facade
        LoanApprover loanApprover = new LoanApprover();

        // Person-1
        Persom person = new Persom("Bob", 5000, true);
        checkEligibility(person, 20000, loanApprover);
        System.out.println("-----------");
        // Person-2
        person = new Persom("Tony", 125000, true);
        checkEligibility(person, 125000, loanApprover);
        System.out.println("------------");
    }

    private static void checkEligibility(Persom person, int claimAmount, LoanApprover approver) {
        String approvalStatus = approver.CheckLoanEligibility(person, claimAmount);
        System.out.println(person.name+"'s approval status: "+approvalStatus);
    }
}