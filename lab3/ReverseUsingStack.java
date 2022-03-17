/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class3;

import java.util.Arrays;

/**
 *
 * @author youse
 */
public class ReverseUsingStack {
    
    public static void main(String[] args) {
       
        int[] a = {11,12,13,14,15} ;
        
        ArrayStack<Integer> s = new ArrayStack<>(a.length);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
           s.push(a[i]);
            
        }
        
        for (int i = 0; i < a.length; i++) {
            a[i] = s.pop() ; 
            
        }
                
        System.out.println("after reverse using stack");
        System.out.println(Arrays.toString(a));
    }
}
