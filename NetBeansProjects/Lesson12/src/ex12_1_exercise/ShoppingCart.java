/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_1_exercise;

/**
 *
 * @author letti
 */
//In the ShoppingCart class, 
//6.  Declare and instantiate a Shirt object, using the 3 arg constructor.
//7.  Call the display() method on the object reference. 
//      Where is the display method coded?
//
/**
 *
 * @author letti
 */
public class ShoppingCart {

    public static void main(String[] args) {

        // instantiate a Shirt object and call display() on the object reference
        Shirt myShirt = new Shirt(200.99, '1', 'R');
        myShirt.display();

        Shirt yourShirt = new Shirt(100.99, '2', 'S');
        yourShirt.display();
    }
}
