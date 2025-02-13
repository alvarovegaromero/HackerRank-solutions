# https://www.hackerrank.com/challenges/nested-list/problem

if __name__ == '__main__':             
    map_name_score = {}
    scores = []
    
    for _ in range(int(input())):
        name = input() 
        score = float(input())
        map_name_score[name] = score
        scores.append(score)
        
    second_lowest_score = sorted(list(set(scores)))[1] #taking the second lowest score
    
    second_lowest_names = []
    
    for key, value in map_name_score.items():
        if (value == second_lowest_score): 
            second_lowest_names.append(key)
    
    second_lowest_names.sort()
    
    for name in second_lowest_names:
        print (name)
    