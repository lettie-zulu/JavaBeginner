/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap03;

import java.util.Scanner;

/**
 *
 * @author letti
 */
public class MarblesApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //declaration
        int numMarbles;
        int numChildren;
        int marblesPerChild;
        int marblesLeft;
        
        //input data
        System.out.println("Welcome to the marble divvy-upper");
        System.out.println("Number of marbles: ");
        numMarbles = sc.nextInt();
        System.out.println("Number of children: ");
        numChildren = sc.nextInt();
        
        //results calculation
        marblesPerChild = numMarbles / numChildren;
        marblesLeft = numMarbles % numChildren;
        
        //print results
        System.out.println("Give each child " + marblesPerChild + " marbles");
        System.out.println("You'll have " + marblesLeft + " marbles left over");
    }
}
