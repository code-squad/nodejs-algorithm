import itertools

def primNumber(n):
    if n < 2: return False
    if n == 2: return True
    if n % 2 == 0: return False

    m = int(n**0.5)+1

    for i in range(3,m,2):
        if n % i == 0:
            return False
    return True

def findPrimeNum(numbers):
    count = 0
    a = set()
    for k in range(len(numbers)):
        n = list(itertools.permutations(numbers, k+1))

        for i in n:
            s = ''.join(i)
            a.add(int(s))

    for j in a:
        if primNumber(j):
            count += 1
    return count

# nums = '17'
nums = '011'

findPrimeNum(nums)