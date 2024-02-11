/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelscount;

/**
 *
 * @author DELL
 */
import java.util.*;
public class VowelsCount {

    public static void main(String[] args) {       
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> vowelCount = new LinkedHashMap<>();
        vowelCount.put('a', 0);
        vowelCount.put('e', 0);
        vowelCount.put('i', 0);
        vowelCount.put('o', 0);
        vowelCount.put('u', 0);

        for (char c : input.toLowerCase().toCharArray()) {
            if (vowelCount.containsKey(c)) {
                vowelCount.put(c, vowelCount.get(c) + 1);
            }
        }

        for (char vowel : vowelCount.keySet()) {
            System.out.println(vowel + ":" + vowelCount.get(vowel));
        }
    }
}
