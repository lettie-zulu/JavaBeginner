/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_2_exercise;

/**
 *
 * @author letti
 */
public class ShoppingCart {

    public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item item1 = new Item();
        Item item2 = new Item();
        //Print both item descriptions and run code.
        item1.desc = "Shirt";
        item2.desc = "Sock";
        System.out.println(item1.desc);
        System.out.println(item2.desc);

        // Assign one item to another and run it again.
        System.out.println("Assigning item2 to item1");
        item1 = item2;
        System.out.println(item1.desc);
        System.out.println(item2.desc);
    }

}
