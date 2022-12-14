// Link: https://www.hackerrank.com/challenges/matching-word-non-word/problem

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("\\w\\w\\w\\W\\w\\w\\w\\w\\w\\w\\w\\w\\w\\w\\W\\w\\w\\w");
         // Use \\ instead of using \ 
        // W -> non word character      w -> word character
    }
}