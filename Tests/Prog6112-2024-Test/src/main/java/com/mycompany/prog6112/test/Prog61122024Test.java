/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112.test;

import java.util.Scanner;

/**
 *
 * @author USER-PC
 */
public class Prog61122024Test {

    public static void main(String[] args) {
        String[] town = {"Cape Town", "Johhanesburg", "Port Elizabeth"};
        String[] accidentType = {"CAR", "MOTOR BIKE"};
        int[][] accidents = new int[2][3];
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < accidents.length; row++) {

            for (int col = 0; col < accidents[row].length; col++) {
                System.out.println("Enter the number of " + accidentType[row] + " for " + town[row] + ": ");
                accidents[row][col] = input.nextInt();

            }//for col

        }//fo row

    }//main
}
