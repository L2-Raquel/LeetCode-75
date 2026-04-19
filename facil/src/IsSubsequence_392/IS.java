package IsSubsequence_392;

public class IS {
    public static void main(String[] args) {
String s="acb";
String t="ahbgdc";
boolean isSubsequence = false;
int indiceS = 0;
int indiceT =0;
int contador=0;

while(indiceS<s.length()&&indiceT<t.length()) {

    if(s.charAt(indiceS)==t.charAt(indiceT)) {
        contador++;
        indiceS++;
    }

    indiceT++;
}


if(contador==s.length()){
    isSubsequence=true;
}

        System.out.println(isSubsequence);

    }
}
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
---
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence.
In this scenario, how would you change your code?
 ---
Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

 ---
Constraints:

    0 <= s.length <= 100
    0 <= t.length <= 104
    s and t consist only of lowercase English letters.

 */