// Link: https://www.hackerrank.com/challenges/matching-same-text-again-again/problem

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("([a-z])([\\w])([\\s])([\\W])([\\d])([\\D])([A-Z])([a-zA-Z])([aeiouAEIOU])([\\S])\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10"); // Use \\ instead of using \ 
        // () -> for creating the groups
    } 
}