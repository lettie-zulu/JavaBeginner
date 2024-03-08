/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author letti
 */
public class TestLambda {
    public static void main(String[] args) {
        String[] nums = {"one", "two", "three"};
        List<String> myList = Arrays.asList(nums);
        System.out.println(myList);
        ArrayList<String> myArrayList = new ArrayList(myList);
        //Urinary operator
        myList.replaceAll(s -> s.toUpperCase());
        System.out.println(myList);
        //Predicate
        myArrayList.removeIf(s -> s.equals("two"));
        System.out.println(myArrayList);
        
    }
  
    
}
