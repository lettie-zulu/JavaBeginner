/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap02;

/**
 *
 * @author letti
 */
public class ShadowApp {
    static int x;
    public static void main(String[] args) {
        x = 5;
        System.out.println("x = " + x);
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = " + ShadowApp.x);
    }
}
