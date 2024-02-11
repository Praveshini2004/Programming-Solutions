/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.textjustification;

/**
 *
 * @author DELL
 */
import java.util.*;
public class TextJustification {
        public static String justifyText(String text, int length) {
    
        String[] words = text.split("_"); 
        
        int totalSpaces = length - text.length();
        int spaceCount = words.length - 1; 
        int spacePerWord = totalSpaces / spaceCount; 
        
        StringBuilder justifiedText = new StringBuilder(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < spacePerWord; j++) {
                justifiedText.append('_');
            }
            justifiedText.append(words[i]);
        }
        
        return justifiedText.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text = sc.nextLine();
        int desiredLength = sc.nextInt();
        String justifiedText = justifyText(text, desiredLength);
        System.out.println(justifiedText + "\nlength is " + desiredLength);
    }
}
