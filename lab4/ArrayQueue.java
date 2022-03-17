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
public class ArrayQueue <E> implements Queue_interface<E>{
    
    final static int capacity = 100 ; 
    E[] data ;
    int sz = 0 ;   // هذا المتغيير يعطيك عدد العناصر الموجودة وليس له علاقة بالمواقع
    int f = 0 ;

    public ArrayQueue( int c) {
        data = (E[]) new Object[c] ;
    }

    public ArrayQueue() {
        this(capacity) ;
    }

    @Override
    public boolean isEmpty() {
        return sz == 0 ;
    }

    @Override
    public int size() {
        return sz ;
                
    }

    @Override
    public void enqueue(E element) {
        
        if (size() == data.length)
            throw new IllegalStateException("Queue is full");
        
        int index = (f + sz) % data.length ; 
        data[index] = element ; 
        sz++ ; 
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null ; 
        
        E deleted = data[f] ;
        data[f] = null ; 
        f = (f + 1) % data.length ; // تكون محصورة بين اول موقع واخر موقع
        sz--;
        return deleted ;
    }

    @Override
    public E first() {
        if ( isEmpty()) return null ; 
        return data[f] ;
    }
 
    
}