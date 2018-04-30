
package offline2;

public class CoffeeA implements Coffeeinterface {
    @Override
    public void addMilk() {
        System.out.println("Milk added for CoffeeA");
    }

    @Override
    public void addCaffeine() {
        System.out.println("Caffeine added to CoffeeA");
    }

    @Override
    public void addSugar() {
        System.out.println("Sugar added to CoffeeA");
    }
}
