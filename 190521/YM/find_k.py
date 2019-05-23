def solution(array, commands):
    answer = []
    for command in commands:
        i, j, k = command
        temp = sorted(array[i-1:j])
        answer.append(temp[k-1])
    return answer

arr = [1, 5, 2, 6, 3, 7, 4]
commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
print(solution(arr, commands))
