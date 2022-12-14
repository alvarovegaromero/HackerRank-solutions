//Link: https://www.hackerrank.com/challenges/matching-digits-non-digit-character/problem

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d"); // Use \\ instead of using \ 
        // digit -> \\d      NON digit -> \\D
    }
}