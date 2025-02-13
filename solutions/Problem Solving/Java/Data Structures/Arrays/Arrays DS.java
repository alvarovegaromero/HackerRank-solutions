//https://www.hackerrank.com/challenges/arrays-ds/problem

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

public static List<Integer> reverseArray(List<Integer> a) {
        //We could use: Collections.reverse(a);
        
        Integer tmp, size;
        size = a.size();
        for(int i = 0 ; i < size/2 ; i++){
            tmp = a.get(i);
            a.set(i, a.get(size - i - 1));
            a.set(size - i - 1, tmp);
        }
        
        return a;
    }

}