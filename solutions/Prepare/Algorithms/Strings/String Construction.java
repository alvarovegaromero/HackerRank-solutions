//https://www.hackerrank.com/challenges/string-construction/problem

public static int stringConstruction(String s) {
    //cost ist the number of different chars
    Set<Character> set = new HashSet<>();
    
    for (char c : s.toCharArray())
        set.add(c);

    return set.size();
}