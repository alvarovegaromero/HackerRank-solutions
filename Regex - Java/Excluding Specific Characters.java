//Link: https://www.hackerrank.com/challenges/excluding-specific-characters/problem

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\D[^aeiou][^bcDF]\\S[^AEIOU][^.,]$"); // Use \\ instead of using \ 
        // D -> non digit   S -> non-white space character
        // ^ for negating (used with []) and for starting with this pattern
        // $ for finishing with this pattern
    }
}
