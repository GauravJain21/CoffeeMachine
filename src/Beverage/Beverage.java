package Beverage;

import Machine.Machine;

import java.util.HashMap;

abstract public class Beverage {

    public HashMap<String, Integer> getRecipe() {
        return recipe;
    }

    public void setRecipe(HashMap<String, Integer> recipe) {
        this.recipe = recipe;
    }

    public HashMap<String, Integer> recipe;
    abstract public void setRecipe();
    Beverage() {
        recipe = new HashMap<>();

    }
}
