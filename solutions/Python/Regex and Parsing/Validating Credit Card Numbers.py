# https://www.hackerrank.com/challenges/validating-credit-card-number/problem

import re

pattern = r'^(?!.*(\d)(\-*\1){3})[4-6]((\d{3}(\-\d{4}){3})|([\d]{15}))$'

number_inputs = int(input())

for _ in range (number_inputs):
    print('Valid' if re.match(pattern, input()) else 'Invalid')

