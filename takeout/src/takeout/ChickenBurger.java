
package takeout;


public class ChickenBurger implements Burger {
    
    private final Burgertype burger = new Burgertype();
    @Override
    public void addPatty() {
        burger.Add("This is the patty for chickenburger");
    }

    @Override
    public void addSauce() {
        burger.Add("Sauce for chickenburger");
    }

    @Override
    public void addCheese() {
        burger.Add("Cheese for chickenburger");
    }
    public Burgertype getBurger(){
        return burger;
    }
}

