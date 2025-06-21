//https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem

public static String isValid(String s) {
    Map<Character, Integer> charOcurrences = new HashMap<>();
    
    // Count ocurrences
    for (char c : s.toCharArray())
        charOcurrences.put(c, charOcurrences.getOrDefault(c, 0) + 1);
    
    // Count frequencies of ocurrences
    Map<Integer, Integer> freqCount = new HashMap<>();
    for (int freq : charOcurrences.values())
        freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);

    // Same frequency
    if (freqCount.size() == 1)
        return "YES";
    
    if(freqCount.size() == 2) {
        int freq1 = 0, count1 = 0;
        int freq2 = 0, count2 = 0;
        int i = 0;

        for (Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
            if (i == 0) {
                freq1 = entry.getKey();
                count1 = entry.getValue();
            } else {
                freq2 = entry.getKey();
                count2 = entry.getValue();
            }
            i++;
        }

        // One of them should occur only once and either 
        // be 1 or differ by 1 (1 removal)
        if ((count1 == 1 && (freq1 - 1 == freq2 || freq1 == 1)) ||
            (count2 == 1 && (freq2 - 1 == freq1 || freq2 == 1))) {
            return "YES";
        }
    }

    return "NO";
}