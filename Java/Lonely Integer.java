//Link: https://www.hackerrank.com/challenges/lonely-integer/problem

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        
        Set<Integer> my_set = new HashSet<Integer>();
        
        for(int i = 0 ; i < a.size() ; i++){
            if(my_set.contains(a.get(i))) //if already contains the value, it is repeated
                my_set.remove(a.get(i));
            else //First appeareance of the value. Could be the one we are looking for
                my_set.add(a.get(i));
        }
        
        return my_set.iterator().next();  //Print the value it has --> The "lonely integer"  
    }

}