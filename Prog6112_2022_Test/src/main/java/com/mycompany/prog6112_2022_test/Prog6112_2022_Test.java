/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112_2022_test;

import java.util.Scanner;

/**
 *
 * @author USER-PC
 */
public class Prog6112_2022_Test {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        q1();
        q2(input);
    }//main

    public static void q2(Scanner input) {
        System.out.println("Enter the current staff number: ");
        int staffNum = input.nextInt();
        System.out.println("Enter the staff hiring location: ");
        String staffLocation = input.next();
        StaffHiring hir = new StaffHiring(staffNum, staffLocation);
        
        hir.printStaffHiring();
    }//q2

    public static void q1() {
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        int[][] jobs = {{8, 2, 5}, {7, 4, 5}, {5, 5, 2}, {2, 2, 3}, {7, 7, 9}, {7, 8, 5}};
        String sString;
        System.out.println("-".repeat(60));
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("-".repeat(60));
        System.out.println("\t\t" + "Bathrooms\t\tKitchens\t\tGardens");
        for (int row = 0; row < jobs.length; row++) {
            sString = months[row] + "\t\t";
            for (int col = 0; col < jobs[row].length; col++) {
                sString += jobs[row][col] + "\t\t\t";
            }//col
            System.out.println(sString);
        }//row
        System.out.println("-".repeat(60));
        System.out.println("MONTHLY TOTALS");
        System.out.println("-".repeat(60));
        
        for (int row = 0; row < jobs.length; row++) {
            sString = months[row] + "\t";
            int monthTotals = 0;
            for (int col = 0; col < jobs[row].length; col++) {
                monthTotals += jobs[row][col];
                
            }//col
            if (monthTotals >= 15) {
                System.out.println(sString + monthTotals + "\t***");
                
            } else {
                System.out.println(sString + monthTotals);
            }
        }//row
        System.out.println("-".repeat(60));
    }
}
