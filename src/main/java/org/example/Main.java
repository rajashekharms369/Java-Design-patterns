package org.example;

public class Main {
    public static void main(String[] args) {
        // Facade deisgn pattern

    }
    public int lengthOfLastWord(String s) {
        String[] strArray = s.split(" ");
        return strArray[strArray.length-1].length();
    }
}
