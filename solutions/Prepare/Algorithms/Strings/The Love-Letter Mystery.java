//https://www.hackerrank.com/challenges/the-love-letter-mystery

class Result {

    /*
     * Complete the 'theLoveLetterMystery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    // Approach:
    // Two pointers and "reduce" the one with bigger value until they are equal
    // Time Complexity: O(n/2) = O(n) - where n is the length of the string
    // Space Complexity: O(1)
    public static int theLoveLetterMystery(String s) {
        int reductions = 0, left = 0, right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                reductions += Math.abs((int) s.charAt(right) - (int) s.charAt(left));
        
            left++;
            right--;
        }
        
        return reductions;
    }
}