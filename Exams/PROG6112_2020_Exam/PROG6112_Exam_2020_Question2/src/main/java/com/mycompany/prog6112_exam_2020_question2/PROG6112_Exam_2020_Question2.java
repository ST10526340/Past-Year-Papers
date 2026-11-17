/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112_exam_2020_question2;

/**
 *
 * @author USER-PC
 */
public class PROG6112_Exam_2020_Question2 {

    public static void main(String[] args) {
        String[] engWords = {"Sky", "Run", "Study", "Music", "Dog"};

        String[][] translatedwords = {{"hemel", "ciel", "cielo"},
        {"rennen", "courir", "correre"}, {"studie", "etude", "studia"},
        {"muziek", "musique", "musica"}, {"hond", "chien", "cane"}};

        System.out.println("WORS IN ENGLISH\t\tDUTCH\t\tFRENCH\t\tITALIAN");
        System.out.println("-".repeat(70));

        for (int row = 0; row < translatedwords.length; row++) {

            String sLine = engWords[row] + "\t\t\t";
            for (int col = 0; col < translatedwords[row].length; col++) {
                sLine += translatedwords[row][col] + "\t\t";
            }//for col
            System.out.println(sLine);

        }//for row
    }
}
