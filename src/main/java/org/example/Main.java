package org.example;

public class Main {
    public static void main(String[] args) {
        // Composite desing pattern
        System.out.println("*** Composite Pattern ***");
        Employee hodMath = formMathDept();
        Employee hodCompSc = formComputerScienceDept();
        Employee principal = formPrincipal(hodMath, hodCompSc);
        /*
        Printin the leaf-nodes and branches
        in the same way i.e
        in each case we are calling
        printStructures() method.
         */

        System.out.println("The details of the principle object:");
        //Prints the complete college structure.

        principle.printStructures();

        System.out.println("\nThe details of the computer HOD(Computer Sc.) object:");

        //Prints the details of the Mathematics department.
        hodMath.printStructures();

        //Leaf node
        System.out.println("\n The structure of a junior employee(leaf node):");
        hodMath.subordinates.get(0).printStructures();
        // Current management details
        displayManagementDetail(principle, hodComputerScience, hodMath);

        System.out.println("\nThe Lecturer Mr. C.Jones(cseTeacher) resigns.");
        hodCompSc.
    }
}
