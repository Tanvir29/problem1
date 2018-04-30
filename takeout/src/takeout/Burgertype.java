
package takeout;

import java.util.LinkedList;

public class Burgertype {
    
    private final LinkedList<String> parts;
    
    public Burgertype(){
        parts = new LinkedList<>();
    }
    
    public void Add(String part){
        parts.addLast(part);
    }
    
    public void show(){
        System.out.println("\nBurger served as below: ");
        for(int i =0;i<parts.size();i++){
            System.out.println(parts.get(i));
        }
    }
}
