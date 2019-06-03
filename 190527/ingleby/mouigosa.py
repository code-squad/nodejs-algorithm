def solution(answers):
    patternA = [1, 2, 3, 4, 5]
    patternB = [2, 1, 2, 3, 2, 4, 2, 5]
    patternC = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    i = 0
    a = 0
    b = 0
    c = 0
    for s in answers :
        if patternA[i%5] == s:
            a=a+1
        if patternB[i%8] == s:
            b=b+1
        if patternC[i%10] == s:
            c=c+1
        i = i+1
    answer2 = [a,b,c]
    maxt = max(answer2)
    answer = []
    i = 1
    for idx in range(len(answer2)):
        if answer2[idx] == maxt:
            answer.append(idx + 1)
    return answer
