/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap07;

import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author letti
 */
public class TickTockAnonymous {
    
private String tickMsg = "Tick...";
    private String tockMsg = "Tock...";

    public static void main(String[] args) {
        TickTockAnonymous t = new TickTockAnonymous();
        t.go();
    }

    private void go() {
        Timer t = new Timer(1000, /**
                 * **ANONYMOUS CLASS**
                 */
                new ActionListener() {
            private boolean tick = true;

            public void actionPerformed(ActionEvent event) {
                if (tick) {
                    System.out.println(tickMsg);
                } else {
                    System.out.println(tockMsg);
                }
                tick = !tick;
            }
        });
        t.start();
        //display message
        JOptionPane.showMessageDialog(null, "Click OK to exit this program.");
        System.exit(0);
    }

}
