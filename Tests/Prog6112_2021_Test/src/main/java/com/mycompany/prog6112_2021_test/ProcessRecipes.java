/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_2021_test;

/**
 *
 * @author USER-PC
 */
public class ProcessRecipes extends Recipies {

    public ProcessRecipes(String ingredients, int time, String difficulty) {
        super(ingredients, time, difficulty);
        this.ingredients = ingredients;
        this.difficulty = difficulty;
        this.time = time;
    }//constuctor

    @Override
    public void PrintRecipes() {
        System.out.println("*".repeat(60));
        System.out.println("ingredients:" + getIngredients());
        System.out.println("time to make: " + getTime());
        System.out.println("Difficulty: " + getDifficulty());

        System.out.println("*".repeat(60));
    }

}
