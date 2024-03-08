/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

/**
 *
 * @author letti
 */
public class Utils {
    public static void main(String[] args) {
               System.out.println("In main method - start");
        try {
        doThis(); } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Back in main method - end");
    }
    
    static void doThis() throws Exception{
        System.out.println("In doThis()");
        doThat();
        System.out.println("back in doThis");
    }
    
    static void doThat() throws Exception{
        System.out.println("In doThat()");
        throw new Exception();
    }
    
}
    

