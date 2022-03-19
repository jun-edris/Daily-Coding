/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daily_coding_2;

import java.util.Scanner;

/**
 *
 * @author Edris
 */
public class Daily_Coding_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // c for chicken, p for pig
        int c, p;
        try(Scanner scan = new Scanner(System.in)){
            while(true){
                // x for head and y for feet
                int x = scan.nextInt(), y = scan.nextInt();
                // equation for head is x = c + p
                // equation for feet is y = 2c + 4p
                
                // chicken
                // x = c + p 
                // 37 = c + p
                // c = 37 heads - p
                // pig
                // 122 = 2c + 4p
                // substitute c to p to get the number of p
                // 122 = 2(x-p) + 4p
                // 122 = 2x - 2p +4p
                // 122 = 2x + 2p
                // 2p = 122 - 2x
                // p = (122 - (2x))/2
                
                // 122 = 2c + 4p
                // substitute p to c to get the number of c
                // 122 = 2c + 4(x-c)
                // 122 = 2c + 4x - 4c
                // 122 = 4x - 2c
                // 2c = 122 - 4x
                // c = (122 - (4x))/2
                p = (y-(2*x))/2;
                c = x - p;
                System.out.print(c + " " + p);
                break;
            }
            
        }
    }
    
}
