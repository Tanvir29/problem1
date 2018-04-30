
package offline2;

public class CoffeeC implements Coffeeinterface {
    @Override
    public void addMilk() {
        System.out.println("Milk added to CoffeeC");
    }

    @Override
    public void addCaffeine() {
        System.out.println("Caffeine added to CoffeeC");
    }

    @Override
    public void addSugar() {
        System.out.println("Sugar added to CoffeeC");
    }
}
