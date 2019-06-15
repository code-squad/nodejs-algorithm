from itertools import permutations


def makeNumbers(numbers):
    numbers = list(numbers)
    resultA = []
    for i in range(1, len(numbers)+1):
        resultA.append(permutations(numbers, i))
    resultB = [y for x in resultA for y in x]
    answer = set([str(int(''.join(j))) for j in resultB])
    return answer


def countPrimeNumber(numberlist):
    answer = 0
    for i in numberlist:
        t = int(i)
        result = 0
        for j in range(2, t):
            if t % j == 0:
                result += 1
                break
        if result == 0 and t != 1 and t != 0:
            answer += 1
    return answer


def solution(numbers):
    numberlist = makeNumbers(numbers)
    answer = countPrimeNumber(numberlist)
    return answer
