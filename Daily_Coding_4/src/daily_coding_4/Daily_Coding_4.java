/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daily_coding_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Given array of integers, remove each kth element from it
 * Example:
 *  inputArr = [1, 3, 5, 4] and k = 2, the output should be 
 * [1,5]
 * 
 */
public class Daily_Coding_4 {

    static void eachkth(int k, int[] inputArr) {
        /**
         * set new array for the final result
         * let the new array length be inputArr.length / k so that it will just vary to how many numbers should be stored in the new array 
         *
        */
        
        
        // call another variable to serve as a counter for the new array
        int newArray_counter = 0;
        int[] new_inputArr = new int[inputArr.length / k];
        
        // loop how many are stored in the inputArr
        try {
            for(int counter = 0;counter != inputArr.length;counter++) {
            /**
             * then find if the counter + 1 modulo of nth is not equal to 0
             * it is counter + 1 because the counter starts with 0, that means in order for counter to be compared to k you have to add 1, because if you didn't add 1 to counter, the place value of the inputArr that you want to remove will not be exact
             * (counter + 1 % k) is the basis if the inputArr[counter] should be placed to the new array
             * meaning if the counter + 1 % nth, is equal to 0, the value in that specific place will not be stored in the new array 
             * 
            */
                if((counter + 1)% k != 0) {
                    // this new array will store the value of inputArr[counter]
                    new_inputArr[newArray_counter++] = inputArr[counter];
                }
                else {
                    
                }
                
            }
            System.out.print(Arrays.toString(new_inputArr));
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            
        }
        // print the new array result
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Enter kth: ");
        String string_kth  = scan.nextLine();
        int kth = Integer.parseInt(string_kth);
        
        System.out.print("Enter how many elements: ");
        String string_elem  = scan.nextLine();
        int int_elem = Integer.parseInt(string_elem);
        
        int[] inputArr = new int[int_elem];
        
        for(int manyElem = 0; manyElem < inputArr.length; manyElem++) {
            System.out.print("Enter element " + manyElem + ": ");
            inputArr[manyElem] = scan.nextInt();
        }
        eachkth(kth, inputArr);
    }
    
}
