package Beverage;

public class BeverageFactory {
    public Beverage createBeverage(String beverageType) {
        Beverage beverage = null;
        switch (beverageType) {
            case "black_tea":
                beverage = new BlackTea();
                break;
            case "green_tea":
                beverage = new GreenTea();
                break;
            case "hot_coffee":
                beverage = new HotCoffee();
                break;
            case "hot_tea":
                beverage = new HotTea();
                break;
            default:
                System.out.println("Wrong beverage type");
                break;
        }
        return beverage;
    }
}
