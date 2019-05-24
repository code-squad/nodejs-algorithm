def solution(citations):
    citations.sort(reverse=True)
    for i in range(citations[0], -1, -1):
        count = 0
        std = i
        for j in citations:
            if j >= std:
                count += 1
        if count >= std:
            return std
