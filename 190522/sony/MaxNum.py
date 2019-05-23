import functools

def cmp(a,b):
    return int(a+b) - int(b+a)

def solution(numbers):
    numbers = list(map(str,numbers))
    tmp_arr = []
    for i in numbers:
        tmp_arr.append(i)
    tmp_arr.sort(key=functools.cmp_to_key(cmp), reverse=True)
    answer = ''.join(tmp_arr)
    if int(answer) == 0:
        return '0'
    return answer


numbers = [6, 10, 2] # 6210
numbers2 = [3, 30, 34, 5, 9] # 9534330
numbers3 = [0,0,0,0,0,0,0] # 0
print(solution(numbers))
