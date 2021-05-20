package Machine;

import Beverage.Beverage;

import java.util.HashMap;
public class Machine {
    private HashMap<String, Integer> stock;
    public static String HOT_WATER = "hot_water", HOT_MILK = "hot_milk", COFFEE_DECOCTION = "coffee_decoction";
    public static String SUGAR_SYRUP = "sugar_syrup", TEA_LEAVES_SYRUP = "tea_leaves_syrup", GREEN_TEA_SYRUP = "green_tea_syrup";
    public Machine() {
        stock = new HashMap<>();
        addStock(HOT_WATER, 500);
        addStock(HOT_MILK, 500);
        addStock(COFFEE_DECOCTION, 100);
        addStock(SUGAR_SYRUP, 100);
        addStock(TEA_LEAVES_SYRUP, 100);
        addStock(GREEN_TEA_SYRUP, 100);
    }
    public void addStock(String ingredient, int quantity) {
        if(stock.get(ingredient) == null) {
            stock.put(ingredient, quantity);
        }
        else {
            quantity += stock.get(ingredient);
            stock.put(ingredient, quantity);
        }
        return;
    }
    public boolean prepare(Beverage beverage) {
        HashMap<String, Integer> recipe = beverage.getRecipe();
        boolean possible = true;
        for (String currIngredient : recipe.keySet()) {
            int requiredAmount = recipe.get(currIngredient);
            int availableAmount = stock.get(currIngredient);
            if (requiredAmount > availableAmount) {
                System.out.println("Refill " + currIngredient + " by at least " + (requiredAmount - availableAmount));
                possible = false;
            }
        }
        if(possible == false) {
            return false;
        }
        for (String currIngredient : recipe.keySet()) {
            int requiredAmount = recipe.get(currIngredient);
            int availableAmount = stock.get(currIngredient);
            stock.put(currIngredient, availableAmount - requiredAmount);
        }
        System.out.println("Prepared " + beverage.getClass().getSimpleName());
        return true;
    }
    public void getStock() {
        System.out.println("The current inventory is:");
        for(String currIngredient: stock.keySet()) {
            System.out.println(currIngredient + ": " + stock.get(currIngredient));
        }
        return;
    }
}
