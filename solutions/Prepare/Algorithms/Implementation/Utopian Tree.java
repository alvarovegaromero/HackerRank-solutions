//https://www.hackerrank.com/challenges/utopian-tree

public static int utopianTree(int n) {
    int result = 1; //initially 1m
    
    for(int i = 1; i <= n; i++) {
        if(i % 2 != 0) //odd numbers - spring cycles
            result *= 2;
        else
            result += 1;
    }
    
    return result;
}