/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_exam_2023_question2;

/**
 *
 * @author USER-PC
 */
public class Data {

    private final String agentLocation;
    private final String agentName;
    private final double propertyPrice;
    private final int commissionPercentage;

    public Data(String location, String name,
            double price, int commission) {

        this.agentLocation = location;
        this.agentName = name;
        this.propertyPrice = price;
        this.commissionPercentage = commission;
    }

    public String getAgentLocation() {
        return agentLocation;
    }

    public String getAgentName() {
        return agentName;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public int getCommissionPercentage() {
        return commissionPercentage;
    }

}
