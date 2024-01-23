/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_2_exercise;

/**
 *
 * @author letti
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;

        //Declare and initialize the items String array
       String[] items = {"Shirt", "Socks", "Scarf", "Belt"};

        // Change message to show the number of items purchased.  
       message = custName + " wants to purchase " + items.length + "items";
        System.out.println(message);

        // Print an element from the items array. 
        System.out.println(items[1]);

//       System.out.println(items[4]);
    }
}
