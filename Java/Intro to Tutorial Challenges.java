//Link: https://www.hackerrank.com/challenges/tutorial-intro/problem

class Result {

    /*
     * Complete the 'introTutorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER V
     *  2. INTEGER_ARRAY arr
     */

    public static int introTutorial(int V, List<Integer> arr) {
        int index = -1;
        boolean found = false;
        
        for(int i = 0 ;  i < arr.size() && !found ; i++)
            if(arr.get(i) == V)
            {
                found = true;
                index = i;
            }
        
        
        return index;
    }

}