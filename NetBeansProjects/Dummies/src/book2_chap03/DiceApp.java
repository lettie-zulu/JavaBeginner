/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap03;

/**
 *
 * @author letti
 */
public class DiceApp {
    public static void main(String[] args) {
        int roll;
        String msg = "Here are 100 random rolls of a dice: ";
        for (int i = 0; i < 100; i++) {
            roll = randomInt(1,6);
            System.out.println(roll + " ");
            
        }
    }
    
    public static int randomInt(int low, int high) {
        //setting boundaries for random no.s and casting it into int
        int result = (int) (Math.random() * (high - low + 1)) + low;
        return result;
    }
}
