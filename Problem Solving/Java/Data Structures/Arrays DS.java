//Link:  https://www.hackerrank.com/challenges/arrays-ds/problem

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reverse = new ArrayList<>(a); //New list that is = to a
        
        Collections.reverse(reverse); //Use the operation for reversing a list
    
        return reverse;
    }

}