/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex11_4_exercise;

/**
 *
 * @author letti
 */
//
//1. In the main method of ShoppingCart, declare, instantiate, 
//     and initialize at least 3 elements in an ArrayList of Strings.  
//2. Print the ArrayList and run it to test your code.  
//3. Fix the error by adding an import statement.
//3. Use the add method to add a new element somewhere in the 
//     middle of the list.  Hint: use the overloaded add method that takes
//     an index number as one of the arguments. 
//4. Print the list again to see the affect.
//5. Test for a particular value in the ArrayList and remove it 
//     if it exists, remove it. 
//     Hint: Use the contains method.  It returns a boolean 
//     and takes a single argument as the search criteria.
//6. Print the list again.
import java.util.ArrayList;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Lettie");
        names.add("Nipho");
        names.add("Jaco");
        names.add("Thuto");
        System.out.println(names);

        names.add(1, "Thuto");
        System.out.println(names);

        // Check for the existence of a particular String element.  
        // Remove it, if it exists.
        if (names.contains("Nipho")) {
            names.remove("Nipho");
        }
        System.out.println(names);
    }
}
