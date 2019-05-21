

def solution(array,commands):
    answer = []
    for i in range(len(commands)):
        start = commands[i][0]
        end = commands[i][1]
        kth = commands[i][2]
        a = array[start-1:end]
        a.sort()
        answer.append(a[kth-1])
    return answer

arr = [1, 5, 2, 6, 3, 7, 4]
commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
print(solution(arr,commands))



def solution(array, commands):
    answer = []
    for c in commands:
        s = c[0] - 1
        e = c[1]
        k = c[2] - 1
        answer.append(sorted(array[s:e])[k])
    return answer