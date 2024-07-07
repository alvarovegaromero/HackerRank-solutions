# https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    
    maximum = -101 #Any number is bigger than this
    runner_up_score = -101
    
    for score in arr:
        if maximum < score:
            runner_up_score = maximum
            maximum = score
        elif runner_up_score < score and score != maximum:
            runner_up_score = score
            
    print(runner_up_score)            
