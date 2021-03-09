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
public class Average {
    
  public static void main(String[] args) {
      
      int[] arr = {12, 4, 2, 15, 78, 36, 98};
  
        int total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        
       float average = total / arr.length;
        
       
        System.out.format("The average is: " + average);
}
}