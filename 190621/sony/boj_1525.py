import sys
from collections import deque

q = deque()
dist = dict()

a = [list(map(int, sys.stdin.readline().split())) for _ in range(3)]
m = 0

for i in range(3):
    for j in range(3):
        n = a[i][j]
        if n == 0:
            n = 9
        m = m*10 + n

def bfs():
    q.append(m)
    dist[m] = 0

    while q:
        d = q.popleft()
        if d == 123456789:
            return dist[d]
        s = str(d)
        k = s.find('9')
        y,x = k//3, k%3

        for dy, dx in (-1,0), (1,0), (0,-1), (0,1):
            ny, nx = y+dy, x+dx
            if nx < 0 or nx >= 3 or ny < 0 or ny >= 3: continue
            nk = ny*3 + nx
            ns = list(s)
            ns[k], ns[nk] = ns[nk], ns[k]
            nd = int(''.join(ns))
            if dist.get(nd) is None:
                dist[nd] = dist[d]+1
                q.append(nd)
    return -1

print(bfs())