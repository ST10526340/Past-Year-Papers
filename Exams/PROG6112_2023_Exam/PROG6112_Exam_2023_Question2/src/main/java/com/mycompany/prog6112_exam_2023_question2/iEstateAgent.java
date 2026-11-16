/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prog6112_exam_2023_question2;

/**
 *
 * @author USER-PC
 */
public interface iEstateAgent {

    double CalculateCommission(String propertyPrice, String agentCommission);

    boolean ValidateData(Data dataToValidate);
}
