//https://www.hackerrank.com/challenges/is-fibo/problem

// Time Complexity:~ O(log n)
// Space Complexity: O(1)
class Result {
    public static String isFibo(long n) {
        long n0 = 0, n1 = 1, tmp;
        
        while(n1 <= n) {
            if (n1 == n)
                return "IsFibo";
            
            tmp = n1;
            n1 = n1 + n0;
            n0 = tmp;
        }
        
        return "IsNotFibo";
    }
}

