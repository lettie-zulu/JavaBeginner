/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex11_2_exercise;

/**
 *
 * @author letti
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;
        
        if (args.length < 2) {
            System.out.println("2 arguments are required!");
            
        }
        
        name = args[0];
        age = Integer.parseInt(args[1]);
        System.out.println("Name is " + name + " Age is " + age);
    }
}
