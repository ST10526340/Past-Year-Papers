/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_exam_2023_question2;

/**
 *
 * @author USER-PC
 */
public class EstateAgent implements iEstateAgent {

    private Data dataToValidate;

    public boolean valLocation() {
        return dataToValidate.getAgentLocation() != null && !dataToValidate.getAgentLocation().trim().isEmpty();
    }

    public boolean valAgentName() {
        return dataToValidate.getAgentName() != null && !dataToValidate.getAgentName().trim().isEmpty();
    }

    public boolean valProPrice() {
        return dataToValidate.getPropertyPrice() > 0;
    }

    public boolean valPercentage() {
        return dataToValidate.getCommissionPercentage() > 0 && dataToValidate.getCommissionPercentage() <= 100;
    }

    @Override
    public double CalculateCommission(String propertyPrice, String agentCommission) {

        return Double.parseDouble(propertyPrice) * Double.parseDouble(agentCommission) / 100;
    }

    @Override
    public boolean ValidateData(Data dataToValidate) {

        this.dataToValidate = dataToValidate;

        return valAgentName() && valLocation() && valProPrice() && valPercentage();
    }
}
