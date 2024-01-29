/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_8;

/**
 *
 * @author letti
 */
public class Shirt {

    public Shirt() {

    }
    //Fields
    public String description;
    public char colorCode;
    public double price;

    //Constructor
    public Shirt(String desc, String color, double price) {
        setFields(desc, price);
        setColor(color);
        //display();

    }

    public void setColor(String color) {
        if (color.length() > 0) {
            colorCode = color.charAt(0);
        }
    }

    ;
    
    //Methods
    public void display() {
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: R" + price);

    }

    public void setFields(String desc, double price) {
        this.description = desc;
        this.price = price;
    }

}
