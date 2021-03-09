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
public class highest {
         
       public static void main(String[] args) {
        
          int a[] = {1,25,45,8};
        
        int max = a[0];
        for(int i=0; i<a.length; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Highest value:"+max);
    }
    
}
    


