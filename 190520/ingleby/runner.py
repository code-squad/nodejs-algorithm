def solution(participant, completion):
    temp = 0
    dic = {}
    for part in participant:
        dic[hash(part)] = part
        temp += hash(part)
    for comp in completion:
        temp -= hash(comp)
    return dic[temp]
