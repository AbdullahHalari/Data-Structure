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
public class unique {
      public static void main(String[] args) {
  
      int arr[] = {1,1,3,4,3,5,6,3,4,7};
      int len = arr.length;
      
      System.out.println("Unique values are: ");
      
      for (int i = 0; i < len; i++){
         int j;
         for (j = 0; j < i; j++)
         if (arr[i] == arr[j])
            break;
         if (i == j)
         System.out.print( arr[i] + " ");
      }
   
      }
    }

