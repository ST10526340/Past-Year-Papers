/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_exam_2025_question2;

/**
 *
 * @author USER-PC
 */
public class productSales implements iProductSales {

    int[][] sales;
    int numProducts;

    public productSales(int[][] sales, int numProducts) {
        this.sales = sales;
        this.numProducts = numProducts;
    }//constructor

    public int calcTotalSales() {
        int total = 0;

        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];

            }//col

        }//row

        return total;
    }

    public double avgSales() {
        int total = 0;
        int count = 0;

        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
                count += 1;
            }//col

        }//row
        double avg = total / count;
        return avg;
    }

    public int underLimit() {
        int total = 0;
        int count = 0;

        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
                count += 1;
            }//col

        }//row
        double avg = total / count;
        int overSals = 0;
        int underSales = 0;
        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {
                if (sales[row][col] < avg) {
                    underSales += 1;

                } else {
                    overSals += 1;
                }//else
            }//col

        }//row
        return underSales;
    }

    public int overLimit() {
        int total = 0;
        int count = 0;

        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
                count += 1;
            }//col

        }//row
        double avg = total / count;
        int overSals = 0;

        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {
                if (sales[row][col] < avg) {

                } else {
                    overSals += 1;
                }//else
            }//col

        }//row

        return overSals;
    }

    @Override
    public int[][] GetProductSales() {
        return sales;
    }

    @Override
    public int GetTotalSales() {
        return calcTotalSales();
    }

    @Override
    public int GetSalesOverLimit() {
        return overLimit();
    }

    @Override
    public int GetSalesUnderLimit() {
        return underLimit();
    }

    @Override
    public int GetProductsProcessed() {
        return numProducts;
    }

    @Override
    public double GetAverageSales() {
        return avgSales();
    }

}
