
package offline2;

import static java.lang.System.exit;
import java.util.Scanner;

public class Coffeemain {
    
    public static void main(String[] args) {
        
        CoffeeFactory coffeeFactory = CoffeeFactory.getCoffeeFactory();
        Coffeeinterface coffee = null;

        Scanner scanner = new Scanner(System.in);

        String input = null;

        System.out.println("Select an option. Type A for Coffee A , B for Coffee B and C for Coffee C.");

        if(scanner.hasNextLine()){
            input = scanner.nextLine();
        }

        switch (input) {
            case "A":
                coffee = coffeeFactory.makeCoffee("A");
                break;
            case "B":
                coffee = coffeeFactory.makeCoffee("B");
                break;
            case "C":
                coffee = coffeeFactory.makeCoffee("C");
                break;
            default:
                System.out.println("Nothing has been chosen");
                exit(1);
                break;
        }

        coffee.addCaffeine();
        coffee.addMilk();
        coffee.addSugar();
    }
}