/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

/**
 *
 * @author letti
 */
public class TestExeptions {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[5] = 27; // out of bound exception error if you run index 5 [5]
        TestArray myTestArray = new TestArray(5);
                myTestArray.addElement(5,23);
    }
    
}
    

