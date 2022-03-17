/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author youse
 */
public class PrintFiles {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        ArrayQueue<String> filestoprint = new ArrayQueue<>(1);
        
        System.out.println("input files names to print");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 1 ; i++) {
            filestoprint.enqueue(in.next());
            
        }
        
        System.out.println("print files in queue");
        while (!filestoprint.isEmpty()) {            
            
             Scanner filescan = new Scanner(new File(filestoprint.dequeue()));
             while (filescan.hasNextLine()) {                
                 System.out.println(filescan.nextLine());
            }
        }
        
        
        
        
    }
}
