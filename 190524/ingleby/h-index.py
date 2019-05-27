def solution(citations):
    citations.sort()
    index = len(citations)
    for i in citations:
        if i >= index:
            return index
        index = index -1
    return 0
