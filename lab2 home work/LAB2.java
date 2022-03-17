/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author youse
 */
public class LAB2 {

    
    public static int[] reverse (int[] x )
    {
        int n = x.length -1 ; 
        
        for (int i = 0 ; i < x.length / 2 ; i++) {
            int temp = x[i];
            x[i] = x[n] ;
            x[n] = temp ;
            n-- ; 
            
        }
    return x ; 
    
    }
    
    
     public static int[] Copy(int[] arr)
    {
      int [] copyarray = new int[arr.length];
        
        for (int i = 0 ; i < arr.length; i++) {
            
            copyarray[i] = arr[i];
        }    
     
        return copyarray ;    
    } 
    
     
     
     public static void removeElements(int[] array) {
        Random r = new Random();
       
        while (array.length > 0) {
        int index = r.nextInt(array.length);
        System.out.println("INDEX = " + index + ", ELEMENT = " + array[index]);
        int[] array1 = new int[array.length - 1];
      
        for (int i = 0; i < index; i++)
        array1[i] = array[i];
        
        for (int i = index; i < array.length - 1; i++)
        array1[i] = array[i + 1];
        array = array1;
      
        }
    }

     
    
    public static void main(String[] args) {
        
        
        int [] arr = { 19 , 33 , 44 ,50 , 60 ,22,21,99,88} ; 
        
//        System.out.println(Arrays.toString(arr));
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
        

//        System.out.println(Arrays.toString(arr));
//        Copy(arr);
//        System.out.println("The Copy Array is \n"+ Arrays.toString(Copy(arr)) );


//        removeElements(arr);
      
        
    }
    
}
