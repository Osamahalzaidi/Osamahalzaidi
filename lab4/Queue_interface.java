/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class4;

/**
 *
 * @author youse
 * @param <E>
 */
public interface Queue_interface <E> {
 
   boolean isEmpty() ; 
   int size () ; 
   void enqueue (E element) ;
   E dequeue () ;
   E first () ;
   
}
