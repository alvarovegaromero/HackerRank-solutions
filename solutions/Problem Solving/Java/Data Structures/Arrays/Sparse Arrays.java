//https://www.hackerrank.com/challenges/sparse-arrays/problem

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        for (String s : stringList) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }
        
        List<Integer> matchingStrings = new ArrayList<>();
        
        for (String query : queries) {
            matchingStrings.add(frequencyMap.getOrDefault(query, 0));
        }
    
        return matchingStrings;
    }
}