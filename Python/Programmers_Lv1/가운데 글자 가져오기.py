def solution(s):
    len_s = int(len(s)/2)

    if len(s) % 2 == 0:
        return s[len_s-1:len_s+1]
    else:
        return s[len_s]