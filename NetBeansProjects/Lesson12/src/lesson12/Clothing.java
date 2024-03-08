/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author letti
 */

public class Clothing {
    
    
//   private double price;
//   private char size;
//    private int id;
//   
//    public void display(){
//        System.out.println("size is " + getSize());
//    }
//    public void setSize(char size){
//        this.size = size;
//            
//
//    }
//
//    /**
//     * @return the price
//     */
//    public double getPrice() {
//        return price;
//    }
//
//    /**
//     * @param price the price to set
//     */
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    /**
//     * @return the size
//     */
//    public char getSize() {
//        return size;
//    }
//
//    /**
//     * @return the id
//     */
//    public int getId() {
//        return id;
//    }
//
//    /**
//     * @param id the id to set
//     */
//    public void setId(int id) {
//        this.id = id;
        
    
    //example 2
    
//    private int itemID = 0;
//    private String desc = "-description required-";
//    private char colorCode = 'U';
//    private double price = 0.0;
//    
//    //constructor
//    public Clothing(int itemID, String desc, char color, double price){
//        this.itemID = itemID;
//        this.desc = desc;
//        this.colorCode = color;
//        this.price = price;
//    }

    /**
     * @return the itemID
     */
//    public int getItemID() {
//        return itemID;
//    }
//
//    /**
//     * @param itemID the itemID to set
//     */
//    public void setItemID(int itemID) {
//        this.itemID = itemID;
//    }
//
//    /**
//     * @return the desc
//     */
//    public String getDesc() {
//        return desc;
//    }
//
//    /**
//     * @param desc the desc to set
//     */
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//
//    /**
//     * @return the colorCode
//     */
//    public char getColorCode() {
//        return colorCode;
//    }
//
//    /**
//     * @param colorCode the colorCode to set
//     */
//    public void setColorCode(char colorCode) {
//        this.colorCode = colorCode;
//    }
//
//    /**
//     * @return the price
//     */
//    public double getPrice() {
//        return price;
//    }
//
//    /**
//     * @param price the price to set
//     */
//    public void setPrice(double price) {
//        this.price = price;
//    } 
//    public void display(){
//        System.out.println(itemID);
//         System.out.println(colorCode);
//          System.out.println(desc);
//           System.out.println(price);
    
    
//}
    
    //exercise 3
//    private double price; 
//    public Clothing (double price){
//        this.price = price;
        
   // } 
    
    private int itemID;
    private String desc;
    private double price;
    private char colorCode;

    public Clothing(int itemID, String desc, double price, char colorCode){
        this.itemID = itemID;
         this.desc = desc;
          this.price = price;
           this.colorCode = colorCode;
    }
    
    /**
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the colorCode
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * @param colorCode the colorCode to set
     */
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    void display() {
        System.out.println("Id id " + getItemID());
        System.out.println("description is " + getDesc());
        System.out.println("price is  " + getPrice());
        System.out.println("colorcode is  " + getColorCode());
    }
    
    
    
    
    
}