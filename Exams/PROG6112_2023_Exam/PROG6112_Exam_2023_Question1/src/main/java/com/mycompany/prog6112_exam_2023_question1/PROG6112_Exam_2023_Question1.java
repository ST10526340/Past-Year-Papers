/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112_exam_2023_question1;

/**
 *
 * @author USER-PC
 */
public class PROG6112_Exam_2023_Question1 {

    public static void main(String[] args) {
        double[][] sales = {{800000, 1500000, 2000000}, {700000, 1200000, 1600000}};
        String[] agents = {"Joe bloggs", "Jane Doe"};

        System.out.println("ESTATE AGENT SALES REPORT");
        System.out.println("");
        System.out.println("\t\t\tJAN\t\tFEB\t\tMAR");
        System.out.println("-".repeat(60));
        for (int row = 0; row < sales.length; row++) {
            String line = agents[row];
            for (int col = 0; col < sales[row].length; col++) {
                line += "\t" + "R " + sales[row][col];

            }//for col
            System.out.println(line);
        }//for row
        System.out.println("");

        for (int row = 0; row < sales.length; row++) {
            double total = 0;
            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
            }//for col
            System.out.println("Total property sales for " + agents[row] + " = R" + total);

        }//for row
        System.out.println("");
        String topPerformer = "";

        double highest = 0;
        for (int row = 0; row < sales.length; row++) {
            double total = 0;
            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
            }//for col

            double commission = total * 0.02;
            if (highest < commission) {
                topPerformer = agents[row];
                highest = commission;

            }

            System.out.println("Sales commission for " + agents[row] + " = R" + commission);

        }//for row
        System.out.println("");
        System.out.println("Top performing estate agent: " + topPerformer);
    }
}
