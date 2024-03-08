/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author letti
 */
public class TestOverriding {

    public static void main(String[] args) {           
        Shirt myShirt = new Shirt(1, "shirt", 12.99, 'U');
        myShirt.display();

        Trousers myTrousers = new Trousers(1, "shirt", 12.99, 'U', 'M', 'M');
        myTrousers.display();
    }
}
