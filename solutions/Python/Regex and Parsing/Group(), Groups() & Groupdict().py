# https://www.hackerrank.com/challenges/re-group-groups/problem

import re

s = input() #input

m = re.match(r'.*?([^\W_])\1.*', s) #.*? ([^\W_]) \1 .*

if (m):
    print(m.group(1))
else:
    print("-1")
