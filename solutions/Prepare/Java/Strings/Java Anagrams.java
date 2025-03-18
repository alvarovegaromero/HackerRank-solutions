//https://www.hackerrank.com/challenges/java-anagrams/problem

static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) 
        return false;
    
    int[] frequency = new int[26];
    
    for(int i = 0; i < a.length(); i++) {
        frequency[Character.toUpperCase(a.charAt(i)) - 'A']++;
        frequency[Character.toUpperCase(b.charAt(i)) - 'A']--;
    }
    
    for(int i = 0; i < frequency.length; i++)
        if(frequency[i] != 0)
            return false;
    
    return true;
    /* Map is forbidden, so approach is done with arrays
    Map<Character, Integer> frequencyMapA = new HashMap<>();
    Map<Character, Integer> frequencyMapB = new HashMap<>();
    
    char upperChar;
    
    for (char character : a.toCharArray()) {
        upperChar = Character.toUpperCase(character);
        frequencyMapA.put(upperChar, frequencyMapA.getOrDefault(upperChar, 0) + 1);
    }
    
    for (char character : b.toCharArray()) {
        upperChar = Character.toUpperCase(character);
        frequencyMapB.put(upperChar, frequencyMapB.getOrDefault(upperChar, 0) + 1);
    }
    
    for (Map.Entry<Character, Integer> entry : frequencyMapA.entrySet()) {
        if(frequencyMapB.get(entry.getKey()) != entry.getValue())
            return false;
    }
    
    return true;
    */
}
