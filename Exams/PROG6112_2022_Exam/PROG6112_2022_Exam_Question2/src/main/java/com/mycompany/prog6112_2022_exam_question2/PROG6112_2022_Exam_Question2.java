/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112_2022_exam_question2;

/**
 *
 * @author USER-PC
 */
public class PROG6112_2022_Exam_Question2 {

    public static void main(String[] args) {
        System.out.println("\t\tFLAT\t\tTOWN HOUSE\t\tHOUSE");
        System.out.println("-".repeat(60));
        String[] province = {"Gauteng", "Natal", "Cape"};
        double[][] Price = {{800000, 1500000, 2000000}, {700000, 1200000, 1600000}, {750000, 1300000, 1800000}};

        for (int row = 0; row < Price.length; row++) {
            String line = province[row] + "\t\t";
            for (int col = 0; col < Price[row].length; col++) {
                line += "R " + Price[row][col] + "\t";

            }//for col
            System.out.println(line);
        }//for row
        System.out.println("");
        for (int row = 0; row < Price.length; row++) {
            double sum = 0;
            int count = 0;
            for (int col = 0; col < Price[row].length; col++) {
                sum += Price[row][col];
                count += 1;
            }//for col
            System.out.println("Average property pirce in " + province[row] + "= R " + String.format("%.3f", sum / count));
        }//for row
    }
}
