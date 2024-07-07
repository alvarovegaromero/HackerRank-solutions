# https://www.hackerrank.com/challenges/validating-named-email-addresses/problem

import re
import email.utils as email_utility

n = int(input())

for _ in range(n):
    user = input()
    
    name, email = email_utility.parseaddr(user)
    
    if (re.match(r'^[a-zA-Z][a-zA-Z0-9-._]+@[a-zA-Z]+\.[a-zA-Z]{1,3}$', email)):
        print(user) 
        #print(email_utility.formataddr((name, email))) # also works