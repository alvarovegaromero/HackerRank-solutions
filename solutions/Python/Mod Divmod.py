# Link: https://www.hackerrank.com/challenges/python-mod-divmod/problem

# Enter your code here. Read input from STDIN. Print output to STDOUT

#Reading input
a = int(input()) 
b = int(input()) 

# Processing and printing output
print(f'{a//b}')
print(f'{a%b}')
print(f'{divmod(a,b)}')