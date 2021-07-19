def solution(a, b):
    answer = []


    for i in range(len(a)):
        answer.append(a[i]*b[i])
    answer = sum(answer)
    return answer