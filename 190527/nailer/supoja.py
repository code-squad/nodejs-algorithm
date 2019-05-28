def solution(answers):
    answer = []
    x = 0
    y = 0
    z = 0
    d = {}
    ySet = [2, 1, 2, 3, 2, 4, 2, 5]
    zSet = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    for i in list(range(len(answers))):
        if answers[i] == i % 5 + 1:
            x += 1
        if answers[i] == ySet[i % 8]:
            y += 1
        if answers[i] == zSet[i % 10]:
            z += 1
    if x==y and y==z:
        return [1,2,3]
    if x>y and x>z:
        return [1]
    if y>x and y>z:
        return [2]
    if z>x and z>y:
        return [3]
    if x==y and y > z:
        return [1, 2]
    if y==z and z > x:
        return [2, 3]
    if z==x and x > y:
        return [1, 3]
    
    return answer
