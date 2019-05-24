def h_index(citations):
    citations.sort(reverse=True)
    count = 0
    for i in range(len(citations)):
        count +=1
        if citations[i] <= count:
            if citations[i] == count:
                return citations[i]
            if citations[i-1] >= count-1:
                return count-1
    return len(citations)


## 다른 사람 풀이
def solution(citations):
    citations = sorted(citations)
    l = len(citations)
    for i in range(l):
        if citations[i] >= l-i:
            return l-i
    return 0

