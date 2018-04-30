
package offline2;

public class CoffeeB implements Coffeeinterface {
    @Override
    public void addMilk() {
        System.out.println("Milk added to CoffeeB");
    }

    @Override
    public void addCaffeine() {
        System.out.println("Caffeine added to CoffeeB");
    }

    @Override
    public void addSugar() {
        System.out.println("Sugar cannot be added to CoffeeB");
    }
}