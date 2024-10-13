package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Facade deisgn pattern
//        System.out.println("*** Template method pattern demonstration. ***\n");
//        BasicEngineering preferredCourse = new ComputerEngineering();
//        System.out.println("ComputerScience course structure.");
//        preferredCourse.displayCourseStructure();
//        System.out.println();
//        preferredCourse = new Electronics();
//        preferredCourse.displayCourseStructure();
        byte c = 1;
        byte d = 11;
        System.out.println(c+d);
        testingVarArgs(1);
        testingVarArgs(1,2,3);

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
    }
    
}
