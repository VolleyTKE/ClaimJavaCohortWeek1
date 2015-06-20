/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalizefirstletter;

import java.util.Arrays;

/**
 * Capitalize the first letter of every word in a sentence
 * @author Chris
 */
public class CapitalizeFirstLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String input = "Never odd or even";

        char[] sentence = input.toCharArray();
        
        sentence[0] = Character.toUpperCase(sentence[0]);
        
        for (int i = 1; i < sentence.length; i++) {
            if (Character.isWhitespace(sentence[i - 1])) {
                sentence[i] = Character.toUpperCase(sentence[i]);
            }
            System.out.println(Arrays.toString(sentence));

        }
        System.out.println(Arrays.toString(sentence));
        
        
    }
    
}
