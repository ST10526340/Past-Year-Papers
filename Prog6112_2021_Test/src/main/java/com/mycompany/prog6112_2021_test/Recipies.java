/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_2021_test;

/**
 *
 * @author USER-PC
 */
public abstract class Recipies implements iRecipe {

    String ingredients;
    int time;
    String difficulty;

    public Recipies(String ingredients, int time, String difficulty) {
        this.ingredients = ingredients;
        this.time = time;
        this.difficulty = difficulty;
    }

    @Override
    public void PrintRecipes() {

    }

    public String getIngredients() {
        return ingredients;
    }

    public int getTime() {
        return time;
    }

    public String getDifficulty() {
        return difficulty;
    }

}
