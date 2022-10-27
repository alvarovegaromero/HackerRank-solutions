//Link: https://www.hackerrank.com/challenges/apple-and-orange/problem

class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // [s, t] -> Interval of the house
        // a -> Position of the apple tree || b -> position of the orange tree
        // List are relative to the position of the tree
        int apples_on_house = 0, oranges_on_house = 0;
        int final_position; //real position of the fruit that we are processing
        
        //Get the real position of every fruit, and check if it is in the same range as the house
        for(int i = 0 ; i < apples.size() ; i++){
            final_position = apples.get(i) + a;
            
            if(final_position >= s && final_position <= t)
                apples_on_house++;
        }
 
         for(int i = 0 ; i < oranges.size() ; i++){
            final_position = oranges.get(i) + b;
            
            if(final_position >= s && final_position <= t)
                oranges_on_house++;
        }
               
        System.out.println(apples_on_house);
        System.out.println(oranges_on_house);
    }
}
