/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_2022_test;

/**
 *
 * @author USER-PC
 */
public class StaffHiring extends Staff {

    public StaffHiring(int staffNum_, String location_) {
        super(staffNum_, location_);
        this.location = location_;
        this.staffNum = staffNum_;
    }

    public void printStaffHiring() {
        System.out.println("STAFF HIRING REPORT");
        System.out.println("**".repeat(20));

        System.out.println("LOCATION: " + getStaffLocation() + "\n" + "STAFF NUMBER: " + getStaffNumber() + "\n" + "HIRE STAFF: " + getStaffHiringProcess());

    }//print
}
