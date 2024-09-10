package org.example;

public class Main {
    public static void main(String[] args) {
        // Facade deisgn pattern
        System.out.println("*** Template method pattern demonstration. ***\n");
        BasicEngineering preferredCourse = new ComputerEngineering();
        System.out.println("ComputerScience course structure.");
        preferredCourse.displayCourseStructure();
        System.out.println();
        preferredCourse = new Electronics();
        preferredCourse.displayCourseStructure();
    }
}
