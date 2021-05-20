package Beverage;

import Machine.*;

public class GreenTea extends Beverage {
    @Override
    public void setRecipe() {
        recipe.put(Machine.HOT_WATER, 200);
        recipe.put(Machine.SUGAR_SYRUP, 20);
        recipe.put(Machine.GREEN_TEA_SYRUP, 30);
    }
}
