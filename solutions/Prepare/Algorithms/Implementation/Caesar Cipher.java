//https://www.hackerrank.com/challenges/caesar-cipher-1/problem

public static String caesarCipher(String s, int k) {
    StringBuilder str = new StringBuilder();
    
    k = k % 26;

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        if (Character.isLowerCase(c)) {
            char newChar = (char) ('a' + (c - 'a' + k) % 26);
            str.append(newChar);
        } else if (Character.isUpperCase(c)) {
            char newChar = (char) ('A' + (c - 'A' + k) % 26);
            str.append(newChar);
        } else { // Non-alphabetic characters remain unchanged
            str.append(c);
        }
    }

    return str.toString();
}