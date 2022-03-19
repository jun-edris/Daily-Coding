/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daily_coding_3;

import java.util.Scanner;

/**
 *
 * @author Edris
 */
public class Daily_Coding_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Title: To the left, to the right
        
        Given a starting number x, move the next numver y one space to the right if y > x, move to the left if y < x
        or other wise retain your position. You may assume that numbers will never go beyond the left border.
           
        */
        Scanner scan = new Scanner(System.in);
        
        int[] input = new int[12];
        int count = 0;
        
        System.out.println("Enter 12 digits:");
        
        //for input
        for(int i = 0;i < input.length;i++){
            input[i] = scan.nextInt();
        }
        System.out.println("Output \n");
        System.out.println(input[0]);
        for(int a = 1;a < input.length;a++){
            if(input[a] > input[a-1]){
                ++count;
                for(int b = 0;b < count;b++){
                    System.out.print(" ");
                }
                System.out.print(input[a]);
            }
            else if(input[a] < input[a-1]){
                --count;
                for(int b = 0;b < count;b++){
                    System.out.print(" ");
                }
                System.out.print(input[a]);
            }
            else if(input[a] == input[a-1]){
                for(int b = 0;b < count;b++){
                    System.out.print(" ");
                }
                System.out.print(input[a]);
            }
            System.out.println();
        }
        
        
        /*
        
        if(input[x+1] > input[x]){
                if(x == 0){
                    System.out.print(input[x]);
                    
                }
                else if(x > 0){
                    for(int a = 0;a < x;a++){
                        System.out.print(" ");
                    }
                    System.out.print(input[x]);
                    
                }
                x++;
            }
        
        for(int j = 0;j < input.length;j++){ // display 12 times
            
            if(j+1 > input.length){ 
                break;
            }
            else{ 
                if(input[j+1] > input[j]){ // check if the next int is greater than the current int
                    for(int x = 0;x < j + 1;x++){
                        if(x == j){
                            System.out.print(input[j]);
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
                else if(input[j+1] < input[j]){ // check if the next int is less than the current int
                    
                }
            }
            
            System.out.println();
        }*/
    }   
}
