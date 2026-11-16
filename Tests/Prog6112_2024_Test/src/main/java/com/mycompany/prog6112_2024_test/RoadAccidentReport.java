/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_2024_test;

/**
 *
 * @author USER-PC
 */
public class RoadAccidentReport implements IRoadAccidents {

    String vehicleType;
    String city;
    int numAccidents;

    public RoadAccidentReport(String vehicleType_, String City_, int numAccidents_) {
        vehicleType = vehicleType_;
        city = City_;
        numAccidents = numAccidents_;

    }

    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getAccidentTotal() {
        return numAccidents;
    }

    public String RoadAccidentReport() {
        return " \n VEHICLE ACCIDENT REPORT \n" + "*".repeat(60) + "\n" + "VEHICLE TYPE: " + getAccidentVehicleType() + "\n" + "CITY: " + getCity() + "\n" + "ACCIDENT TOTAL: " + getAccidentTotal() + "\n " + "*".repeat(60);
    }

}
