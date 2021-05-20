package Beverage;

import Machine.Machine;

public class BlackTea extends Beverage {
    @Override
    public void setRecipe() {
        recipe.put(Machine.HOT_WATER, 300);
        recipe.put(Machine.SUGAR_SYRUP, 20);
        recipe.put(Machine.TEA_LEAVES_SYRUP, 30);
    }
}
