/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg1;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author SP20-BSCS-0027
 */
public class Task1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        
        String name;
        for(int i=0; i<5; i++){
            System.out.print("ENTER ANY STRING \n");
        
                name = sc.next();
                names.add(name);

        }
        System.out.print("ENTER ANY STRING FOR KNOW THE INDEX \n");
        String index = sc.next();
         if(names.contains(index)){       
        System.out.print(names.indexOf(index));
         }
         else{
            System.out.print("STRING NOT FOUND");
         }
    }
    
}
