/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class1;

import java.util.Scanner;

/**
 *
 * @author youse
 */
public class print_num_method {
    
    public static void main(String[] args) {
        
        int[] arr = new int [5];
          
        get_num(arr);
        print(arr);
    
    
    }
    
    
    public static void get_num (int[] arr)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please Enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            
        }
    }
    
    
    public static void print (int[] arr)
    {
        for (int i = 0 ; i < arr.length ; i++) {
            
           System.out.print(arr[i] + " ");
         }
    
     }


    




}
