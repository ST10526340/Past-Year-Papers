/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_exam_2023_question1;

/**
 *
 * @author USER-PC
 */
public class EstateAgent implements iEstateAgent {

    double[] propertySales;
    String Agents;
    double[] propertyTotals;

    public EstateAgent(double[] propertySales, String Agents, double[] propertyTotals) {
        this.propertySales = propertySales;
        this.Agents = Agents;
        this.propertyTotals = propertyTotals;

    }//constructor

    public double calcAgentSales() {
        double Totalsales = 0;
        for (int i = 0; i < propertySales.length; i++) {
            Totalsales += propertySales[i];

        }
        return Totalsales;
    }//calc sales

    public double calcCommission() {

        double Totalsales = 0;
        for (int i = 0; i < propertySales.length; i++) {
            Totalsales += propertySales[i];

        }
        return Totalsales * 0.02;

    }

    public int TopPerformer() {
        double highest = 0;

        for (int i = 0; i < propertyTotals.length; i++) {

            if (highest < propertyTotals[i]) {
                highest = propertyTotals[i];

            }

        }
        return (int) highest;
    }//top performer

    @Override
    public double EstateAgentSales(double[] propertySales) {
        double total = 0;
        for (int i = 0; i < propertySales.length; i++) {
            total += propertySales[i];
        }
        return total;
    }

    @Override
    public double EstateAgentCommission(double propertySales) {
        return propertySales * 0.02;
    }

    @Override
    public int TopEstateAgent(double[] totalSales) {
        double highest = 0;

        for (int i = 0; i < totalSales.length; i++) {
            if (highest < totalSales[i]) {
                highest = totalSales[i];

            }//if
        }//for i

        return (int) highest;
    }//method

}
