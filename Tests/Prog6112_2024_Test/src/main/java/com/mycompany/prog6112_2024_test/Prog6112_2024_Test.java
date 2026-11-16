/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112_2024_test;

import java.util.Scanner;

/**
 *
 * @author USER-PC
 */
public class Prog6112_2024_Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        q1(input);
        q2(input);

    }//main

    public static void q2(Scanner input) {
        System.out.println("Enter the accident vehicle type: ");
        String vehicleType = input.next();
        System.out.println("Enter the city for the vehicle accidents: ");
        input.nextLine();
        String City = input.nextLine();
        System.out.println("Enter the total " + vehicleType + " accidents for " + City + ":");
        int accidentTotal = input.nextInt();
        RoadAccidentReport report = new RoadAccidentReport(vehicleType, City, accidentTotal);
        System.out.println(report.RoadAccidentReport());
    }//q2

    public static void q1(Scanner input) {
        String[] town = {"Cape Town", "Johhanesburg", "Port Elizabeth"};
        String[] accidentType = {"CAR", "MOTOR BIKE"};
        int[][] accidents = new int[3][2];

        for (int row = 0; row < accidents.length; row++) {

            int Citycounter = 0;
            for (int col = 0; col < accidents[row].length; col++) {
                System.out.println("Enter the number of " + accidentType[col] + " accidents for " + town[row] + ": ");
                accidents[row][col] = input.nextInt();

            }//for col
            Citycounter++;
        }//row   

        System.out.println("-".repeat(60));
        System.out.println("Road Accident Report");
        System.out.println("-".repeat(60));
        System.out.println("\t\t\t" + accidentType[0] + "\t" + accidentType[1]);

        for (int row = 0; row < accidents.length; row++) {
            String sString = town[row] + "\t\t";
            for (int col = 0; col < accidents[row].length; col++) {

                sString += accidents[row][col] + "\t";

            }//col
            System.out.println(sString);
        }//row
        System.out.println("-".repeat(60));
        System.out.println("ROAD ACCIDENT REPORT FOR EACH CITY");
        System.out.println("-".repeat(60));
        int highestAccidents = 0;
        String highestPlace = "";
        for (int row = 0; row < accidents.length; row++) {
            int total = 0;
            for (int col = 0; col < accidents[row].length; col++) {

                total += accidents[row][col];

            }//col
            if (highestAccidents < total) {
                highestAccidents = total;
                highestPlace = town[row];
            }//if
            System.out.println(town[row] + "\t" + total);

        }//row
        System.out.println("");

        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + highestPlace);

    }//q1
}
