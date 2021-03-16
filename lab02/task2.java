/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author SP20-BSCS-0027
 */
public class task2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> value = new ArrayList<Integer>();
        ArrayList<Integer> unique = new ArrayList<Integer>();
        ArrayList<Integer> repeat = new ArrayList<Integer>();
        

         
      int array[] = {3,5,2,5,3,6,8,6,5,3,5,2,6,5,3}; 
      int num;
      for(int i=0; i<15; i++){
          
        value.add(array[i]);
      }
      System.out.print(value);
      // for unique values
      int len = array.length;
      
      System.out.println("\nUnique values are:");
      
      for (int i = 0; i < len; i++){
         int j;
         for (j = 0; j < i; j++)
         if (array[i] == array[j])
            break;
         if (i == j)
         unique.add(array[i]);
      }
        System.out.print( unique);

      
    // find occurrs
         int [] find = new int [array.length];  
        int visited = -1;  
        for(int i = 0; i < array.length; i++){  
            int count = 1;  
            for(int j = i+1; j < array.length; j++){  
                if(array[i] == array[j]){  
                    count++;  
                    find[j] = visited;  
                }  
            }  
            if(find[i] != visited)  
                find[i] = count;  
        }  
   
                  System.out.print("\nocurrs:");     
        for(int i = 0; i < find.length; i++){  
            if(find[i] != visited)  
            repeat.add(find[i]);
        }  
        System.out.println("\n"+repeat);  
      
      
      }
         
     }
    

