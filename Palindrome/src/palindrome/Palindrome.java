/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Arrays;

/**
 *
 * @author Chris
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palin = "Never odd or even";
        String wspalin = palin.replace(" ", "");
        char[] palindrome = wspalin.toLowerCase().toCharArray();
        char[] reverse = new char[palindrome.length];
        System.out.println("Original sentence: " + palin);
        
        for (int j = 0; j < palindrome.length; j++) {
            reverse[j] = palindrome[palindrome.length - 1 - j];
    }
        
        String reversePalindrome = new String(reverse);
    System.out.println("Reversed sentence: " + reversePalindrome);
    
    boolean isPalin = Arrays.equals(palindrome, reverse);
    System.out.println("Is palindrome? " + isPalin);
    }
    
}
