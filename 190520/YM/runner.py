# 완주하지 못한 선수

def solution(p, c):
    p.sort()
    c.sort()
    for i in range(len(c)):
        if (p[i] != c[i]):
            return p[i]
    return p[len(p)-1]

p1 = ["leo", "kiki", "eden"]
c1 = ["eden", "kiki"]

p2 = ["marina", "josipa", "nikola", "vinko", "filipa"]
c2 = ["josipa", "filipa", "marina", "nikola"]

p3 = ["mislav", "stanko", "mislav", "ana"]
c3 = ["stanko", "ana", "mislav"]

print(solution(p1, c1))
print(solution(p2, c2))
print(solution(p3, c3))