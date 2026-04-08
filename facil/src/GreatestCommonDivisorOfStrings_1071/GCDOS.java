package GreatestCommonDivisorOfStrings_1071;

import java.math.BigInteger;
import java.util.Scanner;

public class GCDOS {
    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);
        System.out.println("Primer String:");
      String str1= entrada.nextLine();
        System.out.println("Segundo String:");
      String str2= entrada.nextLine();


        System.out.println("La solucion es: "+gcdOfStrings(str1, str2));
    }




   static public String gcdOfStrings(String str1, String str2) {
String solucion="";

if(!(str1+str2).equals(str2+str1)){
    solucion ="";
}
// "ABCABC" + "ABC" == "ABC" + "ABCABC"
else {
    //int longitudMCD = gcd(str1.length(), str2.length());
    // Puedo usar bigInteger con su propio gcd para ahorrarme crear el método aparte.
    BigInteger n1 = BigInteger.valueOf(str1.length());
    BigInteger n2 = BigInteger.valueOf(str2.length());
    int longitudMCD = n1.gcd(n2).intValue();

    solucion = str1.substring(0, longitudMCD);
}
return solucion;
    }
}

/*
La mayoría de respuestas usaron la recursiva :(

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLen = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLen);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
 */






/*
1071. Greatest Common Divisor of Strings

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

---

Para dos cadenas s y t, decimos que «t divide a s» si y solo si s = t + t + t + ... + t + t (es decir, t se concatena consigo misma una o más veces).

Dadas dos cadenas str1 y str2, devuelve la cadena x más larga tal que x divide tanto a str1 como a str2.
 ---

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"

Output: "ABC"

Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"

Output: "AB"

Example 3:

Input: str1 = "LEET", str2 = "CODE"

Output: ""

Example 4:

Input: str1 = "AAAAAB", str2 = "AAA"

Output: ""

---

Constraints:

    1 <= str1.length, str2.length <= 1000
    str1 and str2 consist of English uppercase letters.

 */