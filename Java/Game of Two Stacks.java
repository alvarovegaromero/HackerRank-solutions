//Link: https://www.hackerrank.com/challenges/game-of-two-stacks/problem

class Result {

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        
        //Not my solution :( but mine close to it
        
        int current_sum = 0;
        int max_selections = 0;
        int indexes_a = -1;
        int indexes_b = 0;
        int temp_sum;
        
        //See how many selections we can get with A
        for (int i = 0; i < a.size(); i++) {
            
            indexes_a = i; //keep how many indexes we have used -> selections
            temp_sum = current_sum + a.get(i);
            
            if (temp_sum > maxSum) {
                indexes_a--; //the last index make the sum outpass de maximum
                break;
            }
            else
                current_sum = temp_sum;
        }
        
        max_selections = indexes_a + 1; //because index starts at 0
    
        //Try selections mixing A and B. We substract one element from A and 
        // add as we can from B
        while (indexes_a >= 0 || current_sum < maxSum) {
            
            while (indexes_b < b.size()) { //Try to fill with elements from B
                temp_sum = current_sum + b.get(indexes_b);
                if (temp_sum > maxSum) { //We outpassed the maximum
                    break;
                }
                indexes_b++; //Keep how many indexes we have used 
                current_sum = temp_sum;
            }

            //We found a bigger "selection"
            //index+1 (because indexA starts at 0) and B we don't reduce it when outpass
            if ((indexes_a + indexes_b + 1) > max_selections)  
                max_selections = (indexes_a + indexes_b + 1);
            
            //We iterated though all A -> maximum is already found
            if (indexes_a == -1) 
                return max_selections;

            current_sum = current_sum - a.get(indexes_a); //Substract element from A
            indexes_a--;
        }
        
        return max_selections;
    }

}