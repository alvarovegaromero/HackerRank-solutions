// Link: https://www.hackerrank.com/challenges/matching-start-end/problem

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d....\\.$"); // Use \\ instead of using \ 
        // ^ -> Position at the beggining       $ -> Position at the end
        // And using \\d as digit, \\. as '.' symbol and . as any character
    }
}