//https://www.hackerrank.com/challenges/find-digits/problem

public static int findDigits(int n) {
    int divisors = 0;
    int original = n;
    
    while(n > 0) {
        int digit = n % 10;
        
        if(digit != 0 &&
            original % digit == 0)
            divisors++;
        
        n = n / 10;
    }
    
    return divisors;
}