/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daily_coding_1;

import java.util.Scanner;

/**
 *
 * @author Edris
 */
public class Daily_Coding_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int count = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String input1 = scan.nextLine();
        
        System.out.print("Enter second string: ");
        String input2 = scan.nextLine();
        
        for(int i = 0;i < input1.length();i++){
            for(int x = 0; x < input2.length();x++){
                if(input1.charAt(i) == input2.charAt(x)){
                    input2 = input2.substring(0,x) + input2.substring(x+1);
                    System.out.println( x + " " + input2.length() + " " + input2);
                    count++;
                   
                }
            }
        }
        System.out.print("Count: " + count);
    }
    
}
