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
public class ArrayStack <E> implements Stack <E>{

    
    E data [] ; 
    int t = -1 ; 
    static final int CAPACITY = 100 ; 

    public ArrayStack(int c) {
        
        data = (E[]) new Object[c] ;
        
    }

    public ArrayStack() {
        this(CAPACITY);
    }
    
    
    @Override
    public boolean isEmpty() {
       return t == -1 ; 
    }

    @Override
    public int size() {
        return t + 1 ;
    }

    @Override
    public void push(E element) {
        
        if ( size() == data.length)
            throw new IllegalStateException("Stack is full") ; 
        
        data[++t]= element ; 
    
    
    }

    @Override
    public E pop() {
       
        if(isEmpty())
            return null ;
        
        E delete = data[t];
        data[t] = null ; 
        t-- ; 
        return delete ; 
    
    
    }

    @Override
    public E top() {
       
    if(isEmpty()) return null ;
    
    return data[t] ;
    
    }
    
}
