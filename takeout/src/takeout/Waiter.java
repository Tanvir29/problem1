/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeout;

/**
 *
 * @author User
 */
public class Waiter {
    Burger myBurger;
    
    public void make(Burger burger){
        myBurger = burger;
        myBurger.addPatty();
        myBurger.addSauce();
        myBurger.addCheese();
    }    
}
