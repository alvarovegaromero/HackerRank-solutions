//https://www.hackerrank.com/challenges/java-string-reverse/problem

public class Solution {
    
    private static boolean isPalindrome(String A) {
        int left = 0;
        int right = A.length() - 1;
        boolean isPalindrome = true;
        
        while (left < right) {
            if (A.charAt(left) != A.charAt(right))
                return false;
            
            
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        
        if(isPalindrome(A))
            System.out.println("Yes");   
        else
            System.out.println("No");    
    
    }
}