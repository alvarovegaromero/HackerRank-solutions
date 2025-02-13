//Link: https://www.hackerrank.com/challenges/kangaroo/problem

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // We can solve this problem with a loop O(n) or with maths O(1)
        String result = "NO";
        
        //f1(x) = x1 + v1*x
        //f2(x) = x2 + v2*x
        
        //When f1(x) == f2(x) --> Intersection point. If we solve the equation,
        // we will see: x = (x2 - x1) / (v1 - v2)
        
        double intersection_point = (double) (x2 - x1) / (double) (v1 - v2);
        //System.out.println(intersection_point);
        
        //if the intersection point is positive (jumps are only positive) and is integer (jumps are done totally, not partially), then is possible.
        if((intersection_point % 1) == 0 && intersection_point > 0) 
            result = "YES";
            
        return result;
    }
}
