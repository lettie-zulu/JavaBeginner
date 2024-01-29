/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing9;

/**
 *
 * @author letti
 */
public class Shirt {

    private int shirtID = 0;
    private String description = "description required";
    private char colorCode = 'U';
    private double price = 0.0;
    
    public Shirt() {
        setColorCode('U');
    }
    // 1 argument constructor

    public Shirt(char colorCode) {
        setColorCode(colorCode);
    }
    // 2 argument constructor

    public Shirt(char colorCode, double price) {
        this(colorCode);
        setPrice(price);
    }
    public Shirt(char colorCode, String desc, double price) {
        this(colorCode,price);
        //setColorCode(colorCode);
        setDescription(desc);
        //setPrice(price);
    }

    //public Shirt(char colorCode, String desc, double price) {
//        setDescription(desc);
//        setColorCode(colorCode);
//        setPrice(price);
//    }
    
    
    public char getColorCode() {
        return colorCode;

    }

    public void setColorCode(char colorCode) {
        if (colorCode == 'R') {
            this.colorCode = colorCode;
            return;
        }
        if (colorCode == 'G') {
            return;
        }
        if (colorCode == 'B') {
            return;
        }
        System.out.println(colorCode + " is an invalid color code! use R, G or B");
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
}
