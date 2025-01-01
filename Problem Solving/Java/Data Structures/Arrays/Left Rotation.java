//https://www.hackerrank.com/challenges/array-left-rotation/problem

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // We could use: Collections.rotate(copy, -d);
        
        List<Integer> copy = new ArrayList<>(arr);
        Integer newPosition, size;
        size = arr.size();
        
        for(int i = 0 ; i < size ; i++){
            newPosition = ((i - d) % size + size) % size;
            copy.set(newPosition, arr.get(i));
        }
        
        return copy;
    }
}