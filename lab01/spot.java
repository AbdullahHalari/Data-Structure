/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author SP20-BSCS-0027
 */
public class spot {
         public static void main(String[] args) {       
             int arr[][] = {{3, 4, 5, 1, 3,},
                            {5, 7, 0, 0, 1,},                            
                            {2, 3, 0, 0, 7,},                           
                            {0, 0, 3, 5, 2,},                          
                            {0, 0, 1, 6, 7,}                            
             };
             int count = 0;
             for (int i = 0; i < arr.length; i++) { 
                 for (int j = 0; j < arr.length; j++) { 
                     
                
                     System.out.print(arr[i][j] + " "); 
            } 
            System.out.println();             
        } 
          for (int i = 0; i < arr.length-1; i++) {     
            for (int j = 0; j < arr.length-1; j++) {     
                if(arr[i][j]==0){
                    if(arr[i+1][j]==0){
                        if(arr[i][j+1]==0){
                        if(arr[i+1][j+1]==0){
                              count++;
                       }
                    }            
                 }
            }
        }     
    }     
    System.out.println("Number of black spot: " + count);
        }       
         }
 
         
