/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson2;
import javax.swing.JOptionPane;
/**
 *
 * @author letti
 */
public class DialogApp {
    public static void main(String[] args) {
        String s;
        s = JOptionPane.showInputDialog("Enter an integer:");
        int x = Integer.parseInt(s);
        System.out.println("You enter " + x + ".");
    }
}
