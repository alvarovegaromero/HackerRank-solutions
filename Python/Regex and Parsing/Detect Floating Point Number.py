# https://www.hackerrank.com/challenges/introduction-to-regex/problem

import re

PATTERN_DECIMAL = re.compile(r'^[\+-]?\d*\.\d+$')

test_cases = int(input())

for _ in range(test_cases):
    N = input()
    
    if PATTERN_DECIMAL.match(N):
        print("True")
    else:
        print("False")