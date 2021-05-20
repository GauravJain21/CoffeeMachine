package Beverage;

import Machine.*;

public class HotCoffee extends Beverage{
    @Override
    public void setRecipe() {
        recipe.put(Machine.HOT_WATER, 100);
        recipe.put(Machine.HOT_MILK, 400);
        recipe.put(Machine.COFFEE_DECOCTION, 50);
        recipe.put(Machine.SUGAR_SYRUP, 30);
        return;
    }
}
