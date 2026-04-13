package ReverseVowelsOfString_345;

public class RVOS {
    public static void main(String[] args) {

String s =  "IceCreAm";
StringBuilder sInvertido = new StringBuilder(s);
        int izq =0;
        int der= s.length()-1;
        boolean vocalIz= false;
        boolean vocalDer=false;
        char aux=0;

while(izq<=der){
/*vocal=(s.charAt(i)=='a'||s.charAt(i)=='e' || s.charAt(i)=='u' || s.charAt(i)=='i' || s.charAt(i)=='o'
        ||s.charAt(i)=='A'||s.charAt(i)=='E' || s.charAt(i)=='U' || s.charAt(i)=='I' || s.charAt(i)=='O');*/
    vocalIz= "aeiouAEIOU".indexOf(sInvertido.charAt(izq)) != -1;
    vocalDer= "aeiouAEIOU".indexOf(sInvertido.charAt(der)) != -1;


if(vocalDer && vocalIz){
    aux = sInvertido.charAt(izq);
    sInvertido.setCharAt(izq, sInvertido.charAt(der));
    sInvertido.setCharAt(der, aux);
    der--;
    izq++;
} else if(!vocalIz) {
    izq++;
} else if(!vocalDer) {
    der--;
}
}

        System.out.println(sInvertido.toString());
s=sInvertido.toString();
    }
}
/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"



Constraints:

    1 <= s.length <= 3 * 105
    s consist of printable ASCII characters.

    Respuesta más aceptada:
    class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            if (!isVowel(arr[left])) {
                left++;
                continue;
            }

            if (!isVowel(arr[right])) {
                right--;
                continue;
            }

            char c = arr[left];
            arr[left] = arr[right];
            arr[right] = c;

            left++;
            right--;
        }

        return new String(arr);
    }

    public boolean isVowel(char cc) {
        char c = Character.toLowerCase(cc);
        return c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

 */