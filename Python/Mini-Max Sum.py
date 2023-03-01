# Link:https://www.hackerrank.com/challenges/mini-max-sum/problem

def miniMaxSum(arr):
    arr.sort() # sort from lowest to highest value
    min = arr[0] + arr[1] + arr[2] + arr[3] 
    max = arr[4] + arr[3] + arr[2] + arr[1] #we know we have 5 elements
    print(min, max)
        