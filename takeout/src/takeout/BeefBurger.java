
package takeout;


public class BeefBurger implements Burger {
    
    private final Burgertype burger = new Burgertype();
    @Override
    public void addPatty() {
        burger.Add("This is the patty for beefburger");
    }

    @Override
    public void addSauce() {
        burger.Add("Sauce for beefburger");
    }

    @Override
    public void addCheese() {
        burger.Add("Cheese for beefburger");
    }
    public Burgertype getBurger(){
        return burger;
    }
}

