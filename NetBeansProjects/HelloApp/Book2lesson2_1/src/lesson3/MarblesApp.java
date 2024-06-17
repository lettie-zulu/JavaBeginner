/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson3;

import java.util.Scanner;

/**
 *
 * @author letti
 */
public class MarblesApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //declaration
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;

        //get the input data
        System.out.println("Welcome to the marble divvy-upper. ");
        System.out.println("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.println("Number of children: ");
        numberOfChildren = sc.nextInt();

        //calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftOver = numberOfMarbles % numberOfChildren;

        //print results
        System.out.println("Give each child " + marblesPerChild + " marbles.");
        System.out.println("You will have " + marblesLeftOver + " marbles left over.");
    }
}
