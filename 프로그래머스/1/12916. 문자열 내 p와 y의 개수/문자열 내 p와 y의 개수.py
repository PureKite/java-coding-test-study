def solution(s):
    answer = True
    s = s.upper()
    pNum = 0
    yNum = 0
    for i in s:
        if i == 'P':
            pNum += 1
        elif i == 'Y':
            yNum += 1
    return pNum == yNum