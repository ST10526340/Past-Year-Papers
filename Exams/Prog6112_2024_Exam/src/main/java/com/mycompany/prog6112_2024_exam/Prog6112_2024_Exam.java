/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112_2024_exam;

import javax.swing.SwingUtilities;

/**
 *
 * @author USER-PC
 */
public class Prog6112_2024_Exam implements iMovieTickets {

    public static void main(String[] args) {
        q1();
        q2();
    }//main

    public static void q1() {
        int[][] sales = {{3000, 1500, 1700}, {3500, 1200, 1600}};
        String[] movies = {"Napoleon", "Oppenheimer"};
        System.out.println("MOVIE TICKET SALES REPORT- 2024 \n\n \t\t JAN \t FEB \t MAR \n" + "-".repeat(60));

        for (int row = 0; row < sales.length; row++) {
            String string = movies[row] + "\t";
            for (int col = 0; col < sales[row].length; col++) {

                string += sales[row][col] + "\t";

            }//for col
            System.out.println(string);
        }//for row
        System.out.println("");
        int total = 0;
        int preTotal = 0;
        for (int row = 0; row < sales.length; row++) {
            String string = "Total movie tocket sales for " + movies[row];
            preTotal = total;
            total = 0;
            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
            }//for col, used to access rows of 2d array to add the revenue
            string += " " + total;
            System.out.println(string);

        }//for row , used to access rows of 2d array to add the revenue
        System.out.println("");
        if (preTotal > total) {
            System.out.println("Top performing movie: " + movies[0]);
        } else {
            System.out.println("Top performing movie: " + movies[1]);
        }//if to check which movie performed better
    }//question 1

    @Override
    public int totalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int i = 0; i < movieTicketSales.length; i++) {
            total += movieTicketSales[i];

        }//for i
        return total;
    }

    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int highest = 0;
        String Movie = "";
        for (int i = 0; i < totalSales.length; i++) {
            if (highest < totalSales[i]) {
                highest = totalSales[i];
                Movie = movies[i];

            }//if to check which movie has the greater sales

        }//for i used to loop through the arrays
        return Movie;
    }//topMovie

    public static void q2() {
        JFrame_Question2_Exam_2024 frame = new JFrame_Question2_Exam_2024();
        frame.setVisible(true);
    }
}
