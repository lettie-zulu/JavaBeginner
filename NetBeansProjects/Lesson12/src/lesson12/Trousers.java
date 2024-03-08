/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author letti
 */
public class Trousers extends Clothing {
   private char gender;

    public Trousers(int itemID, String desc, double price, char colorCode, char fit, char gender) {
        super(itemID, desc, price, colorCode);
        this.gender = gender;
    }
   
//
    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
  public void setGender(char gender) {
      this.gender = gender;
   }
    public void display(){
        super.display();
       String fit = null;
        System.out.println("fit is " + fit);
        System.out.println("gender is " + getGender());
    }
}

