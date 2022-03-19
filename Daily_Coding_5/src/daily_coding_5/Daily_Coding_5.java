/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daily_coding_5;

import java.util.Scanner;

/**
 *
 * @author Edris
 */
public class Daily_Coding_5 {

    /**
     * @param args the command line arguments
     */
    
    static void productEven(int input1, int input2) {
        int result = input1 == input2 ? 0 : 1; 
        if(input1 > input2) {
            System.out.println("not applicable");
        }
        else {
            int product = 1;
            for(int counter = input1; counter <= input2; counter++) {
                
                if(counter%2 == 0) {
                    result *= counter;
                }
            }
            System.out.println(result);
        }
        
    }
    public static void main(String[] args) {
        productEven(3, 5);
        productEven(3, 3);
        productEven(3, 2);
        productEven(1, 10);
    }
    
}
