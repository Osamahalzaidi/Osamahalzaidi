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
public class Management {
    
    public static void main(String[] args) {
        
        Student[] team = new Student[3];
        
//        Student s1= new Student(1,"Emad");
//        team[0] = s1;
//        
//        Student s2= new Student(2,"Yousef");
//        team[1]=s2;
//        
//        Student s3= new Student(3,"Rassm");
//        team[2]=s3;
//        
//        
//        for (int i = 0; i < team.length; i++) {
//            System.out.println(team[i].toString());
//            
//        }



///////// to get inputs from user ///////////////

        
    Scanner in = new Scanner(System.in);

    for (int i = 0; i <team.length ; i++) {

        System.out.println("Please Enter ID and Name for student no : "+ (i+1) );
        Student s = new Student(in.nextInt(),in.next());
        team[i] = s ;
        }

    for (Student team1 : team) {
       
        System.out.println(team1.toString());
    
    }
     
    
        
    }
   
}
