def solution(d, budget):
    d.sort()
    a = []

    for i in d:
        budget -= i
        if budget >=0 :
            a.append(budget)
    return len(a)