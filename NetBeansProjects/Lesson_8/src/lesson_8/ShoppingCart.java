/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_8;

/**
 *
 * @author letti
 */
public class ShoppingCart {

    public static void main(String[] args) {
//        Shirt shirt01 = new Shirt("Sailor", "Blue", 30);
//        Shirt shirt02 = new Shirt("Sweatshirt", "Green", 25);
//        Shirt shirt03 = new Shirt("Skull Tee", "Blue", 15);
//        Shirt shirt04 = new Shirt("Tropical", "Red", 20);

        Shirt myShirt = new Shirt("Sailor", "Green", 85);
        System.out.println("Shirt color: " + myShirt.colorCode);
        changeShirtColor(myShirt, 'B');
        System.out.println("Shirt color changed to: " + myShirt.colorCode);
        
    }
    
    public static void changeShirtColor(Shirt theShirt, char color) {
        theShirt = new Shirt("Skull Tee", "Yellow", 150);
        theShirt.colorCode = color;
    }
}
