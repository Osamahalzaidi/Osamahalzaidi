/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class4;

import java.util.Scanner;

/**
 *
 * @author youse
 */
public class Project_in_Class4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayQueue<Integer> queue = new ArrayQueue<>(5) ; 
        
        System.out.println("is the queue empty ? " + queue.isEmpty());
        System.out.println("input queue element ");
        Scanner in = new Scanner(System.in);
        for (int i = 0 ; i < 5 ; i++) {
            queue.enqueue(in.nextInt());
            System.out.println("first = "+ queue.first());
            System.out.println("size = "+ queue.size());
        }
        
        while (! queue.isEmpty()) {
            System.out.print(queue.dequeue() + "\t");
            
        }
        

    }
    
}
