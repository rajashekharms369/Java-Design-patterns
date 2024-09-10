package org.example;

abstract class BasicEngineering {

    public final void displayCourseStructure(){
        /*
        The course needs to be completed in the following sequence.
        1. Mathematics
        2. SoftSkills
        3. Subclass specific paper.
         */
        //Common papers
        courseOnMathematics(); // Step-1
        courseOnMathematics(); // Step-2

        //Course-specific papers
        courseOnSpecialPaper(); // Step-3
    }

    private void courseOnMathematics(){
        System.out.println("1. Mathematics");
    }

    private void courseOnSoftSkills(){
        System.out.println("2. Soft-Skills");
    }

    public abstract void courseOnSpecialPaper();
}