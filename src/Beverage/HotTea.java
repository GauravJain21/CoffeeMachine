package Beverage;

import Machine.*;

public class HotTea extends Beverage{
    @Override
    public void setRecipe() {
        recipe.put(Machine.HOT_WATER, 200);
        recipe.put(Machine.HOT_MILK, 100);
        recipe.put(Machine.SUGAR_SYRUP, 30);
        recipe.put(Machine.TEA_LEAVES_SYRUP, 30);
    }
}
