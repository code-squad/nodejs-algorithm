n = int(input())
d = {}
for i in list(range(n)):
    tmp = input()
    try:
        d[tmp] += 1
    except:
        d[tmp] = 1
for i in list(range(n-1)):
    tmp = input()
    d[tmp] -= 1
    if d[tmp] == 0:
        del d[tmp]
print(list(d.keys())[0])
