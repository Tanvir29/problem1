
package takeout;


public class BeefBurger implements Burger {
    
    private final Burgertype burger = new Burgertype();
    @Override
    public void addPatty() {
        burger.Add("This is patty for beefburger");
    }

    @Override
    public void addSauce() {
        burger.Add("Sauce for beefburger");
    }

    @Override
    public void addCheese() {
        burger.Add("Cheese  beefburger");
    }
    public Burgertype getBurger(){
        return burger;
    }
}

