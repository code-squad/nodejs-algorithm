import sys

n = int(sys.stdin.readline())


def countingSort(n):
    count_list = [0] * (10001) # 주어지는 수의 크기 범위만큼 리스트 길이를 만든다.
    for _ in range(n):
        a = int(sys.stdin.readline())
        count_list[a] += 1

    for j in range(len(count_list)):
        if count_list[j] != 0:
            for _ in range(count_list[j]):
                print(j)

countingSort(n)
