
package latihan2modul3;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author diazh
 */
public class Latihan2 {

    public void queueExample(){
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("remove: " +queue.remove());
        System.out.println("element: " +queue.element());
        System.out.println("poll: " +queue.poll());
        System.out.println("peek: " +queue.peek());
        
    }
    public static void main(String[] args) {
        new Latihan2().queueExample();
    }
    
}
