import collections

## 방법1
def solution(participant, completion):
    count_participant = collections.Counter(participant)
    count_completion = collections.Counter(completion)
    remainder = count_participant-count_completion
    return list(remainder.keys())[0]

# 방법2
def solution(participant, completion):
    # 이름을 오름차순으로 정렬
    participant.sort()
    completion.sort()

    # 동명이인 중에 완주 못한 사람 체크
    for p,c in zip(participant, completion):
        if p != c:
            return p

    # 동명이인이고 완주를 하지 못했으나 이름 상 제일 뒤에 있는 사람인 경우 체크
    # 예시) 정렬된 후의 변수가 participant['a', 'b', 'b', 'z', 'z'] / completion['a', 'b', 'b', 'z'] 인 경우
    return participant[-1]


p = ['marina', 'josipa', 'nikola', 'vinko', 'filipa']
c = ['josipa', 'filipa', 'marina', 'nikola']

p2 = ['mislav', 'stanko', 'mislav', 'ana']
c2 = ['stanko', 'ana', 'mislav']
print(solution(p2,c2))