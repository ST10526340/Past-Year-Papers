/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112_2021_test;

import java.util.Scanner;

/**
 *
 * @author USER-PC
 */
public class Prog6112_2021_Test {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        q1();
        q2(input);
    }//main

    public static void q2(Scanner input) {
        System.out.println("Enter the ingredients: ");
        String ingredients = input.nextLine();
        System.out.println("Enter time to make (in minutes): ");
        int time = input.nextInt();
        System.out.println("Enter difficulty: ");
        String difficulty = input.next();
        ProcessRecipes recipe = new ProcessRecipes(ingredients, time, difficulty);
        recipe.PrintRecipes();
    }//q2

    public static void q1() {
        String[] Years = {"DELIVERIES 2018", "DELIVERIES 2019", "DELIVERIES 2020"};
        int[][] deliveries = {{128, 135, 139}, {155, 129, 175}, {129, 130, 185}};
        System.out.println("*".repeat(60));
        System.out.println("DELIVERIES REPORT");
        System.out.println("*".repeat(60));
        System.out.println("\t\t\t JAN\tFEB\tMAR");
        int totaDeliveries = 0;
        int max = 0;
        int min = 999;
        String sString;
        for (int row = 0; row < deliveries.length; row++) {
            sString = Years[row] + "\t\t";
            for (int col = 0; col < deliveries[row].length; col++) {
                sString += deliveries[row][col] + "\t";
                totaDeliveries += deliveries[row][col];
                if (max < deliveries[row][col]) {
                    max = deliveries[row][col];
                    
                }//max

                if (min > deliveries[row][col]) {
                    min = deliveries[row][col];
                    
                }
            }//for col
            System.out.println(sString);
        }//for row
        System.out.println("*".repeat(60));
        System.out.println("DELIVERY STATISTICS");
        System.out.println("*".repeat(60));
        System.out.println("Total Deliveries: \t" + totaDeliveries);
        System.out.println("Maximium Deliveries: \t" + max);
        System.out.println("Minimum Deliveries: \t" + min);
        System.out.println("*".repeat(60));
        
    }//q1
}
