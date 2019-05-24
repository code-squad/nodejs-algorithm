def solution(numbers):
    lst = []
    if numbers.count(0) == len(numbers):
        return '0'
    for i in numbers:
        lst.append(str(i))
    return ''.join(sorted(lst, key=lambda x: x*3, reverse=True))
