/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112.exam;

/**
 *
 * @author USER-PC
 */
public class Prog61122025Exam {
    
    public static void main(String[] args) {
        String[] quarters = {"Quarter 1", "Quarter 2", "Quater 3"};
        int[][] sales = {{300, 150, 700}, {250, 200, 600}};
        System.out.println("PRODUCT SALES REPORT - 2025");
        double avg = 0;
        int total = 0;
        int count = 0;
        int min = 9999;
        int max = 0;
        for (int row = 0; row < sales.length; row++) {
            
            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
                count++;
                if (sales[row][col] > max) {
                    max = sales[row][col];
                    
                }//max

                if (sales[row][col] < min) {
                    min = sales[row][col];
                    
                }//min

            }//for col

        }//for row
        avg = total / count;
        System.out.println("-".repeat(60));
        System.out.println("Total sales: " + total);
        System.out.println("Average sales: " + avg);
        System.out.println("Maximum sale: " + max);
        System.out.println("Minimum sale: " + min);
        System.out.println("-".repeat(60));
        
    }//main
}
