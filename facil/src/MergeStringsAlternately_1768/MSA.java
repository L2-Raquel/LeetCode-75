package MergeStringsAlternately_1768;


import java.util.Scanner;

public class MSA {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Primer String");
        String word1 = entrada.nextLine();
        System.out.println("Segundo String");
        String word2 = entrada.nextLine();

        StringBuilder constructor = new StringBuilder();

int min= Math.min(word1.length(),word2.length());

String larga = word1.length()>word2.length()?word1:word2;

                for(int i=0; i<min; i++){
                constructor.append(word1.charAt(i));
                constructor.append(word2.charAt(i));
            }
        if(word1.length()!=word2.length()) {
            constructor.append(larga.substring(min));
        }


        System.out.println(constructor.toString());
    }
}

/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

La mayoría ha usado while sin crear variables auxiliares... :(

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder merged = new StringBuilder();

        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }

        // Append remaining characters from word1 or word2
        while (i < word1.length()) {
            merged.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            merged.append(word2.charAt(j));
            j++;
        }

        return merged.toString();
    }
}

 */