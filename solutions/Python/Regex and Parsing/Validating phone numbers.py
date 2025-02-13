# https://www.hackerrank.com/challenges/validating-the-phone-number/problem

import re

number_inputs = int(input())
regex_pattern = r"^[789]\d{9}$"

for i in range(number_inputs):
    number = input()
    if re.match(regex_pattern, number):
        print("YES")
    else:
        print("NO")
        