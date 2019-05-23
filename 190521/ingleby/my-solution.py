def solution(array, commands):
    answer = []
    for arr in commands :
        array2 = array[arr[0]-1:arr[1]]
        array2.sort()
        answer.append(array2[arr[2] - 1])
    return answer
