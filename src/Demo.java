import Beverage.Beverage;
import Beverage.BeverageFactory;
import Machine.Machine;

import java.io.*;
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/gaurav/IdeaProjects/CoffeeMachine/src/input.txt"));
        PrintStream out = new PrintStream(new FileOutputStream("/home/gaurav/IdeaProjects/CoffeeMachine/src/output.txt"));
        System.setOut(out);
        String[] input = reader.readLine().trim().split("\\s+");
        Machine machine = new Machine();
        BeverageFactory beverageFactory = new BeverageFactory();
        while ("exit".equals(input[0]) == false) {
            switch (input[0]) {
                case "add_stock":
                    machine.addStock(input[1], Integer.parseInt(input[2]));
                    break;
                case "get_stock":
                    machine.getStock();
                        break;
                case "prepare":
                    Beverage beverage = beverageFactory.createBeverage(input[1]);
                    machine.prepare(beverage);
                    break;
                default:
                    System.out.println("Wrong input. Enter again");
                    break;
            }
            input = reader.readLine().trim().split("\\s+");
        }
    }
}
