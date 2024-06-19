/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap05;

import java.util.Scanner;

/**
 *
 * @author letti
 */
public class NumberPhobia {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int number = 1;
        String input;
        
        while (true) {
            System.out.println("Number is: " + number);
            System.out.println("Would you like to keep counting? Yes or No");
            
            input = sc.next();
            
            if (input.equalsIgnoreCase("No")) {
                break;
            }
            
            number += 1;
        }
        System.out.println("Thank you for counting along. Goodbye!");
    }
}
