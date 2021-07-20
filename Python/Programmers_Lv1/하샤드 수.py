def solution(x):
    x = str(x)
    list_x = []
    answer = 0

    for i in x:
        list_x.append(i)
        list_x = list(map(int, list_x))
    for j in range(len(list_x)):
        answer += list_x[j]

    if int(x)%answer == 0:
        return True
    else:
        return False