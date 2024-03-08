/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex13_1_exercise;
import java.util.ArrayList;
/**
 *
 * @author letti
 */
//1. Convert the days array to an ArrayList.


import java.util.*;


//     Use Arrays.asList to return a List.  
//     Use that List to initialize a new ArrayList.  
//     Preferably do this all on one line.
//2. Iterate through the ArrayList, testing to see if an element is "sunday".
//     If it is a "sunday" element, print it out, converting it to upper case.
//     Use:
//       (from the String class)
//         - public boolean equals (Object o);
//         - public void toUpperCase();
// 
//     If it is not "sunday", print it out anyway, but not in upper case.
//
//3. After the for loop print out the ArrayList.
//     While within the loop, did "sunday" get printed in upper case?
//     Was the "sunday" element in the array converted to upper case?
//     Your instructor will explain what's going on in the next topic.


public class ShoppingCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};
        
        // Convert the days array into an ArrayList
        List<String> myDaysList = Arrays.asList(days);
        ArrayList<String> myDaysArrayList = new ArrayList(myDaysList);
        
        // Loop through the ArrayList, printing out "sunday" elements in 
        //   upper case (use toUpperCase() method of String class) 
        for(String day : myDaysArrayList) {
            if(day.equals("sunday")) {
                System.out.println(day.toUpperCase());
            }else {
                System.out.println(day);
            }
        }
        // Print all other days in lower case 
        // Print out the ArrayList  
        System.out.println(myDaysArrayList);


    }    
}