/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112_exam_2021_question2;

/**
 *
 * @author USER-PC
 */
public class PROG6112_Exam_2021_Question2 {

    public static void main(String[] args) {
        String[] manufacturer = {"Triumph", "Honda", "Suzuki", "Yamaha", "Ducati"};
        int[][] sales = {{500, 100, 500}, {70, 80, 200}, {100, 100, 200}, {100, 70, 50}, {300, 100, 500}};
        String status;
        String salesSum[] = new String[sales.length];
        for (int row = 0; row < sales.length; row++) {

            int sum = 0;
            for (int col = 0; col < sales[row].length; col++) {
                sum += sales[row][col];
            }//for col

            if (sum >= 300) {

                status = "Gold";

            } else {
                status = "Silver";
            }//else

            salesSum[row] = sum + "\t" + status;

        }//for row

        System.out.println("BRAND\t\tQUARTER 1\tQUARTER 2\tQUARTER 3\tTOTAL\tSTATUS");
        System.out.println("-".repeat(60));
        for (int row = 0; row < sales.length; row++) {

            String line = manufacturer[row] + "\t\t";
            for (int col = 0; col < sales[row].length; col++) {
                line += sales[row][col] + "\t\t";

            }//for col
            line += salesSum[row];
            System.out.println(line);
        }//for row

    }
}
