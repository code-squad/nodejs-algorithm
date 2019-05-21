def solution(array, commands):
    answer = []
    for c in commands:
        s = c[0] - 1
        e = c[1]
        k = c[2] - 1
        answer.append(sorted(array[s:e])[k])
    return answer
