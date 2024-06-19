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
public class NumberPhobia2 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int number = 1;
        String input = "yes";
        
        while (input.equalsIgnoreCase("Yes")) {
            System.out.println("Number is: " + number);
            System.out.println("Would you like to keep counting? Answer Yes");
            input = sc.next();
            
            number += 1;
        }
        
        System.out.println("Thank you for counting along. Goodbye!");
    }
}
