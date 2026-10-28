/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prog6112.exam;

/**
 *
 * @author USER-PC
 */
public interface IEstate {

    double EstateAgentSales(double[] propertySales);

    double EstateAgentCommission(double propertySales);

    int TopEstateAgent(double[] totalSales);
}
