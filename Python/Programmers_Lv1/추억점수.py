def solution(name, yearning, photo):
    year_dict = {n:y for n,y in zip(name,yearning)}
    answer = []
    ans = 0

    for i in photo:
        for j in i:
            if j in year_dict.keys():
                ans += year_dict[j]
        answer.append(ans)
        ans = 0
    return answer