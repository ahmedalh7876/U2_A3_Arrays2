/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a3_arrays2;

//Imports a text scanner in console
import java.util.Scanner;

public class U2_A3_Arrays2 {
    
    public static void main(String[] args) {
        
        //Initializes the text scanner
        Scanner keyedInput = new Scanner (System.in);
        
        //Declare an array for 5 strings
        String [ ] friends = new String [5];
        
        //Prompts user for the input of 5 strings
        System.out.println("Enter the names of five friends:");
        //Runs a "for loop" to extract 5 strings from the user
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        //Outputs the 2nd, 3rd, and 4th names that the user input
        System.out.println("The secon, third, and fourth names listed were:");
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]);
        System.out.println("Fourth: " + friends[3]); 
    }
    
}
