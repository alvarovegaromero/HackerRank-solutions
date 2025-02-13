// Link: https://www.hackerrank.com/challenges/matching-whitespace-non-whitespace-character/problem

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("\\S\\S\\s\\S\\S\\s\\S\\S"); // Use \\ instead of using \ 
        // \\S -> non-white space character     \\s -> any whitespace character 
    }
}