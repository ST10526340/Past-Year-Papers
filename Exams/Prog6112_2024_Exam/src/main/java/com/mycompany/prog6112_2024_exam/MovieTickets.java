/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_2024_exam;

/**
 *
 * @author USER-PC
 */
public class MovieTickets implements iMovieTickets_Question2 {

    int numTickets;
    double ticketPrice;
    String movieName;

    public MovieTickets(int numTickets, double ticketPrice, String movieName) {
        this.numTickets = numTickets;
        this.ticketPrice = ticketPrice;
        this.movieName = movieName;
    }//constructor

    public boolean chkMovieName() {
        return !movieName.isEmpty();

    }//chkMovieName

    public boolean chckTicketPrice() {
        return ticketPrice >= 0; //else
    }//chckTicketPrice

    public boolean chkNumTicket() {
        return numTickets >= 0; //else
    }//chkNumTicket

    public boolean fullCheck() {
        return chckTicketPrice() && chkMovieName() && chkNumTicket();
    }

    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        return (numberOfTickets * ticketPrice) * 1.14;
    }

    @Override
    public boolean ValidateData(JFrame_Question2_Exam_2024.MovieTicketData movieTicketData) {

        return fullCheck();

    }

}//MovieTickets
