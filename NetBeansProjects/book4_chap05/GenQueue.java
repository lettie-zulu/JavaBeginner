/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book4_chap05;

import java.util.LinkedList;
/**
 *
 * @author letti
 */
public class GenQueue {
    
 private LinkedList<E> list = new LinkedList<E>();
    
    public void enqueue(E item) {
        list.addLast(item);
    }
    
    public E dequeue() {
        return list.poll();
    }
    
    public boolean hasItems() {
        return !list.isEmpty();
    }
    
    public int size() {
        return list.size();
    }
    
    public void addItems(GenQueue<? extends E> q) {
        while (q.hasItems()) {
            list.addLast(q.dequeue());
        }
    }
}
