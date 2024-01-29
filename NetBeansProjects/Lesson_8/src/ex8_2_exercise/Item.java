/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8_2_exercise;
//1. Write a setItemFields method that takes 3 args and assigns them 
//     to desc, quantity, and price fields.  The method returns void. 
//2. Write an overloaded setItemFields method that takes 4 args and 
//     returns an int.  The method assigns all 4 fields.  Invalid value for 
//     the colorCode arg is ' ' (a single space)
//   If the colorCode arg is invalid, return -1 without assigning the value.
//   If the colorCode is valid, assign the colorCode field and then assign 
//     the remaining fields by calling the 3 arg method.
/**
 *
 * @author letti
 */
public class Item {
     String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    
    public void setItemFields(String desc, int qty, double price) {
        this.desc = desc;
        this.quantity = qty;
        this.price = price;
    }

    // Write a public 4-arg setItemDisplay method that returns an int.
    
    public int setItemFields(String desc, int qty, double price, char color) {
        if (color == ' ') {
            return -1;
        }else {
            this.colorCode = color;
            this.setItemFields(desc, qty, price);
            return 1;
        }
    }
    
}
