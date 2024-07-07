# https://www.hackerrank.com/challenges/re-sub-regex-substitution/problem

import re

pattern_and =r'(?<=\s)&&(?=\s)'
pattern_or = r'(?<=\s)\|\|(?=\s)'
substitute_and = "and"
substitute_or = "or"


for _ in range(int(input())):
    string = input()

    string = re.sub(pattern_and, substitute_and, string)
    string = re.sub(pattern_or, substitute_or, string)
    
    print(string)
