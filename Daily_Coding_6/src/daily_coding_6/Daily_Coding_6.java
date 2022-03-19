/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daily_coding_6;

import java.util.Scanner;

/**
 *
 * @author Edris
 */
public class Daily_Coding_6 {

    public static void countingValleys(int steps) {
        Scanner scan = new Scanner(System.in);
        
        String[] paths = new String[steps];
        
        int altitude = 0; 
        int level = 0;
        
        System.out.println("Enter path: ");
        for(int i = 0;i < steps;i++) {
            paths[i] = scan.nextLine();
            
            if(paths[i].equalsIgnoreCase("U")) {
                altitude += 1;
                if(altitude == 0) level++;
            }
            if(paths[i].equalsIgnoreCase("D")) {
                altitude -= 1;
            }
        }
        System.out.println(level);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter steps: ");
        int steps = scan.nextInt();
        
        countingValleys(steps);
    }
    
}
