/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112.exam;

/**
 *
 * @author USER-PC
 */
public class Prog61122023Exam {

    public static void main(String[] args) {
        String[] agents = {"Joe Bloggs", "Jane Doe"};
        double[][] propertySales = {{800000, 1500000, 2000000}, {700000, 1200000, 1600000}};

        System.out.println("ESTATE AGENT SALES REPORT");
        System.out.println("\t\t\tJAN" + "\t\t\tFEB" + "\t\t\tMAR");
        System.out.println("-".repeat(60));

        for (int row = 0; row < propertySales.length; row++) {
            String sString = agents[row] + "\t\t";
            for (int col = 0; col < propertySales[row].length; col++) {

                sString += "R " + propertySales[row][col] + "\t\t";

            }//col
            System.out.println(sString);

        }//row
        System.out.println("");

        for (int row = 0; row < propertySales.length; row++) {
            double total = 0;
            for (int col = 0; col < propertySales[row].length; col++) {

                total += propertySales[row][col];

            }//col
            System.out.println("Total property sales for " + agents[row] + " = R" + total);
        }
        System.out.println("");

        double highestcommision = 0;
        String bestPerformer = "";
        for (int row = 0; row < propertySales.length; row++) {
            double total = 0;
            for (int col = 0; col < propertySales[row].length; col++) {

                total += propertySales[row][col];

            }//col

            double commission = ((total) * 0.02);

            if (highestcommision < commission) {
                highestcommision = commission;
                bestPerformer = agents[row];

            }//if
            System.out.println("Sales commision for " + agents[row] + " = R" + commission);
        }//row
        System.out.println("");

        System.out.println("Top performing estate agent: " + bestPerformer);
    }//main
}
