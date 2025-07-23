//https://www.hackerrank.com/challenges/anagram/problem

class Result {

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
        // Invalid input. Odd length
        if (s.length() % 2 != 0)
            return -1;
        
        int minimumChanges = 0;
        String first = s.substring(0, s.length() / 2);
        String second = s.substring(s.length() / 2);
        char currentChar;

        Map<Character, Integer> charCountFirst = new HashMap<>();
        Map<Character, Integer> charCountSecond = new HashMap<>();

        for(int i = 0; i < first.length(); i++) {
            currentChar = first.charAt(i);
            charCountFirst.put(currentChar,
                            charCountFirst.getOrDefault(currentChar, 0) + 1);
        }
        
        for(int i = 0; i < first.length(); i++) {
            currentChar = second.charAt(i);
            charCountSecond.put(currentChar,
                            charCountSecond.getOrDefault(currentChar, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : charCountFirst.entrySet()) {
            int freqInFirst = entry.getValue();
            int freqInSecond = charCountSecond.getOrDefault(entry.getKey(), 0);

            if (freqInFirst > freqInSecond)
                minimumChanges += (freqInFirst - freqInSecond);
        }
        
        return minimumChanges;
    }
}