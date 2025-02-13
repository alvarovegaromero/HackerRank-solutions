//Link: https://www.hackerrank.com/challenges/construct-the-array/problem

class Result {

    /*
     * Complete the 'countArray' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER x
     */
    final static int MOD = 1000000007; //We find the ways modulo 10^9 + 7

    public static long countArray(int n, int k, int x) {
    // Return the number of ways to fill in the array.

        long[] endingInX = new long [n]; //n elements - ways in which vector ends with X
        long[] NOTendingInX = new long [n]; //n - ways in which vector DOESN'T ends with X
  
        if(x != 1){
            endingInX[0] = 0;
            NOTendingInX[0] = 1;
        }
        else{
            endingInX[0] = 1; //first way would be valid if X == 1
            NOTendingInX[0] = 0;            
        }
        
        //n = i+1
        
        for(int i = 1 ; i < n ; i++){

            //Ways in next interaction are the ways that didn't end in X because we
            // can't have consecutives numbers.
            endingInX[i] = NOTendingInX[i-1] % MOD; 
            
            //The ways that doesn't end up in x are the sum of:
            // 1.When with n-1 was a good way for filling the array, all the combinations are valid,                 //     taking into account that we can't have consecutive numbers (k-1)*ending[i-1]
            // 2. Same as before, but also without the case of ending iun X (would be a good case)
            NOTendingInX[i] = (endingInX[i-1] * (k - 1) + NOTendingInX[i-1] * (k - 2)) % MOD;        
        }
        
        //The last value --> ways    
        return endingInX[n-1];
    }

}