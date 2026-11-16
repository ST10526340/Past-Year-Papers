/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112.exam;

/**
 *
 * @author USER-PC
 */
public class EstateAgent implements IEstate {

    double propertySales;
    double commision;
    double totalSales;

    public EstateAgent(double propertySales_, double commision_, double totalSales_) {
        this.propertySales = propertySales_;
        commision = commision_;
        totalSales = totalSales_;
    }//constructor

    @Override
    public double EstateAgentSales(double[] propertySales) {
        return this.propertySales;
    }

    @Override
    public double EstateAgentCommission(double propertySales) {
        return propertySales * 0.02;
    }

    @Override
    public int TopEstateAgent(double[] totalSales) {
        return (int) propertySales;
    }

}
