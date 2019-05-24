def solution(citations):
    citations.sort(reverse=True)
    for i in list(range(len(citations))):
        if i+1 >= citations[i]:
            return citations[i]
        if i+1 > citations[i+1]:
            return i+1
    return len(citations)
