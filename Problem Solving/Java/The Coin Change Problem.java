Link: https://www.hackerrank.com/challenges/coin-change/problem

class Result {

    /*
     * Complete the 'getWays' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. LONG_INTEGER_ARRAY c
     */

    public static long getWays(int n, List<Long> c) {
        if(n == 0) //If the amount to change is 0, there is always a way (no coin)
        {
            return 1;
        }
        
        //Matrix is used for storing the previously computed solutions.
        //The value of a cell represent how many solutions are, for getting the "j" (the amount), using the values lower or equal than "c[i]"
        
        // Initially, the first column is all filled with "1", because there is always a solution. (no coins used)
        // Then, we fill the first row, which values only represent if there is a way for getting the j amount with the first value. (if it is a entire division or not)
        // After that, we apply the algorithm below:
        //  If the current value is bigger than the current amount:
        //      the ways for getting the solution, are the previous ways ((i-1) in the same column)
        //  else
        //      the ways, are the sum of the of previous ways and the ways for getting the amount 
        //      (current_amount - c[i]) at the same row (same c[i] and prevoius values)
                        
        
        long[][] matrix = new long [c.size()][n+1]; //n+1 because we have also the value 0.

        for(int i = 0 ; i < c.size() ; i++)
        {
            matrix[i][0] = 1; 
        }    
        
        for(long i = 0 ; i < c.size() ; i++)
            for(long  j = 0 ;  j < (long) n+1 ; j++) //n+1
            {
                if((int) i == 0)
                {
                    if((j % c.get(0)) == 0)
                        matrix[(int)i][(int)j] = 1;                        
                    else
                        matrix[(int)i][(int)j] = 0;
                }
                else if(c.get((int) i) > j)
                    matrix[(int)i][(int)j] = matrix[(int)(i-1)][(int)j];
                else
                    matrix[(int)i][(int)j] = matrix[(int)(i-1)][(int)j] + matrix[(int)i][(int)(j-c.get((int)i))];
            
            }
                
        return matrix[c.size()-1][n]; //Last cell. Has solution using all coins
    }

}