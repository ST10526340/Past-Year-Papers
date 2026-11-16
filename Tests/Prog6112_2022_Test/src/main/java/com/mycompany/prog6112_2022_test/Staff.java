/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_2022_test;

/**
 *
 * @author USER-PC
 */
public class Staff implements iStaff {

    int staffNum;
    String location;

    public Staff(int staffNum_, String location_) {
        staffNum = staffNum_;
        location = location_;
    }//constuctor

    @Override
    public int getStaffNumber() {
        return staffNum;
    }

    @Override
    public String getStaffLocation() {
        return location;
    }

    @Override
    public String getStaffHiringProcess() {
        if (staffNum > 20) {
            return "NO";

        } else {
            return "YES";
        }
    }

}
