def solution(n,m):
    a,b = n,m
    answer = []
    while m > 0:
        n, m = m, n%m
        answer_gcd = a*b/n
    answer.append(n)
    answer.append(int(answer_gcd))
    return answer