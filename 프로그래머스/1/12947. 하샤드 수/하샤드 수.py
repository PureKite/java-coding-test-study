def solution(x):
    num = str(x)
    result = 0
    for i in num:
        result += int(i)
    
    return x % result == 0