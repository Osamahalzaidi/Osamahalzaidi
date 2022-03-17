/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class3;

/**
 *
 * @author youse
 * @param <E>
 */
public interface Stack <E> {
    
    boolean isEmpty() ; 
    int size();
    void push (E element);
    E pop();
    E top();
    
    
    
}
