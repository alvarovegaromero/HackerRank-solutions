// Link: https://www.hackerrank.com/challenges/matching-x-repetitions/problem

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^[^\\W13579]{40}[\\s13579]{5}$"); // Use \\ instead of using \ 
        //W instead of w because we are negating for taking out odd digits
  }
   
}