/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book5_chap01;

/**
 *
 * @author letti
 */
public class CountDownClockSync extends Thread {
private int start;
public CountDownClockSync(int start) {
        this.start = start;
    }

    public void run() {
        for(int t = start; t >= 0; t --) {
        System.out.println("T minus " + t);
        }
        try{
        Thread.sleep(1000);
        }catch(InterruptedException e){
            {}
        }
    }
}
