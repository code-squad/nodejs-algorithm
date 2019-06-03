import sys
from functools import reduce

a = int(input())
b = int(input())
matrix = [[0]*a for i in range(a)]
row = a//2
column = a//2
sequence = 1
sequenceCount = 0
posiNeg = -1
answerRow = 0
answerCol = 0

for i in range(a*a):
    matrix[row][column] = i+1
    if b == i+1:
        answerRow = row
        answerCol = column
    if sequenceCount == 2*sequence:
        sequence += 1
        sequenceCount = 0
        posiNeg *= -1
    sequenceCount += 1
    if sequenceCount <= sequence:
        row += posiNeg
    else:
        column += posiNeg * -1

for item in matrix:
    print(reduce(lambda x, y: str(x)+' '+str(y), item))
print(answerRow+1, answerCol+1)
