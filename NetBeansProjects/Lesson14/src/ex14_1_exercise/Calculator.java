/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex14_1_exercise;

/**
 *
 * @author letti
 */
//In the Calculator class:
//1.  Change the divide method signature so that it throws 
//      an ArithmeticException.

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    // This method could throw an ArithmeticException
    public double divide(int x, int y)throws ArithmeticException{
        return x / y;
    }
}
