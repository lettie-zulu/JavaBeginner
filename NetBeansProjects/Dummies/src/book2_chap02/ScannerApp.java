/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap02;

import java.util.Scanner;

/**
 *
 * @author letti
 */
public class ScannerApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        //allow for inputs
        int x = sc.nextInt();
        System.out.println("You entered " + x + ".");
    }
}
