/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_2_exercise;

/**
 *
 * @author letti
 */
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Natasha", itemDesc = "Shoes";
        String message;
        message = custName + " has bought a pair of " + itemDesc;
        System.out.println(message);
        // Calculate total and then print the total cost
        double price = 20.55, tax = 0.15, total;
        int quantity = 3;
        total = price * quantity * tax;
        System.out.println("Total cost with tax is R" + total);

        message = custName + " is ready to buy " + quantity + " " + itemDesc;
        System.out.println(message);
        
        total = price * quantity * tax;
        System.out.println("The total including tax is R" + total);
        
    }
}
