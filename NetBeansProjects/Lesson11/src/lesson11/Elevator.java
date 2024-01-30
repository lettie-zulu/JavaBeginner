/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

/**
 *
 * @author letti
 */
public class Elevator {
         
    
    public int currentFloor = 1;

    public void changeFloor(int targetFloor) {
        while (currentFloor != targetFloor) {
            if (currentFloor < targetFloor) {
                goUp();
            } else {
                goDown();
            }
        }
        System.out.println("Reached destination, current floor is " + currentFloor);
    }

    public void goUp() {
        System.out.println("moved to floor " + currentFloor);
        currentFloor++;       
    }

    public void goDown() {
        currentFloor++;
        System.out.println("moved down to floor " + currentFloor);
    }
}
