def solution(answers):
    s1 = [1,2,3,4,5]  # cycle : 5
    s2 = [2,1,2,3,2,4,2,5]  # cycle : 8
    s3 = [3,3,1,1,2,2,4,4,5,5]  # cycle : 10

    a1 = 0
    a2 = 0
    a3 = 0

    for i in range(len(answers)):
        if(s1[i%len(s1)] == answers[i]):
            a1 +=1
        if(s2[i%len(s2)] == answers[i]):
            a2 +=1
        if(s3[i%len(s3)] == answers[i]):
            a3 +=1

    answer_list = [a1,a2,a3]
    m = max(answer_list)
    result = []
    for i in range(len(answer_list)):
        if m == answer_list[i]:
            result.append(i+1)
    return result

