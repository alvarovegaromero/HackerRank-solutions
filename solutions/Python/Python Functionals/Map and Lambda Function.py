# https://www.hackerrank.com/challenges/map-and-lambda-expression/problem

cube = lambda x: x*x*x

def fibonacci(n):
    if n== 0:
        list_fib = []  
    elif n==1:
        list_fib = [0] 
    else:
        list_fib = [0, 1]
    
    for i in range(2, n):
        list_fib.append(list_fib[i - 1] + list_fib[i - 2])
    
    return list_fib

if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))