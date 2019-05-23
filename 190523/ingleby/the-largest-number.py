def solution(numbers):
    stringNumbers = list(map(str, numbers))
    stringNumbers.sort(key=lambda x:x*3, reverse=True)
    answer = ''.join(stringNumbers)
    return answer
