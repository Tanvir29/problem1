
package takeout;

import java.util.Scanner;

public class Offline1 {

    public static void main(String[] args) {
       
        Waiter waiter = new Waiter();
        Scanner scanner = new Scanner(System.in);

        String input = null;

        System.out.println("Select an option. Type B for Beefburger , C for Chickenburger.");

        if(scanner.hasNextLine()){
            input = scanner.nextLine();
        }

        if(input.equals("B")){
            Burger myburger = new BeefBurger();
            waiter.make(myburger);
            Burgertype p1 = myburger.getBurger();
            p1.show();
        } else if(input.equals("C")){
            Burger myburger = new ChickenBurger();
            waiter.make(myburger);
            Burgertype p1 = myburger.getBurger();
            p1.show();
        } 
    }   
}
