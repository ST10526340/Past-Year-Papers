/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112_exam_2025;

/**
 *
 * @author USER-PC
 */
public class PROG6112_Exam_2025 implements iProduct {

    public static void main(String[] args) {
        int[][] sales = {{300, 150, 700}, {250, 200, 600}};
        String[] year = {"Year 1", "Year 2"};
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("-".repeat(40));
        int totalSales = 0;
        int count = 0;
        int max = 0;
        int min = 9999;
        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {
                totalSales += sales[row][col];
                count += 1;

                if (sales[row][col] > max) {
                    max = sales[row][col];

                }//if max

                if (sales[row][col] < min) {
                    min = sales[row][col];

                }
            }//for col

        }//row

        System.out.println("");
        System.out.println("Total sales: " + totalSales);
        System.out.println("Average Sales: " + totalSales / count);
        System.out.println("Maximum sales: " + max);
        System.out.println("Minimum sales: " + min);
        System.out.println("-".repeat(40));

    }//main

    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int row = 0; row < productSales.length; row++) {

            for (int col = 0; col < productSales[row].length; col++) {
                total += productSales[row][col];

            }//col

        }//for row

        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int total = 0;
        int count = 0;
        for (int row = 0; row < productSales.length; row++) {

            for (int col = 0; col < productSales[row].length; col++) {
                total += productSales[row][col];
                count += 1;
            }//col

        }//for row

        return total / count;
    }

    @Override
    public int MaxSale(int[][] productSales) {
        int max = 0;
        for (int row = 0; row < productSales.length; row++) {

            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > max) {
                    max = productSales[row][col];

                }
            }//col

        }//for row
        return max;
    }

    @Override
    public int MinSale(int[][] productSales) {
        int min = 9999;
        for (int row = 0; row < productSales.length; row++) {

            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] < min) {
                    min = productSales[row][col];

                }
            }//col

        }//for row
        return min;
    }
}
