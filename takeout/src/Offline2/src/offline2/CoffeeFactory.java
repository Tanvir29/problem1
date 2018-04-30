package offline2;

public class CoffeeFactory {
    private static CoffeeFactory coffeeFactory;

    private CoffeeFactory(){}

    public static CoffeeFactory getCoffeeFactory(){
        if(coffeeFactory == null){
            coffeeFactory = new CoffeeFactory();
        }
        return coffeeFactory;
    }

    public static Coffeeinterface makeCoffee(String choice){
        if(choice.equals("A")){
            return new CoffeeA();
        }
        else if(choice.equals("B")){
            return new CoffeeB();
        }
        else if(choice.equals("C")){
            return new CoffeeC();
        } 
        else{
            return null;
        }
    }
}


