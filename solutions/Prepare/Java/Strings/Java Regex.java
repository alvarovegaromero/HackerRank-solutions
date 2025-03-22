//https://www.hackerrank.com/challenges/java-regex/problem

class MyRegex {
    // Number from 0 to 256 (first 0-199, second 200-249, third 250-255)
    private String patternFor256 = "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])";
    public String pattern = patternFor256 + "\\." + patternFor256 + "\\." + 
                            patternFor256 + "\\." + patternFor256;
}