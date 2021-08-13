def solution(n):
    n = sorted(list(map(int, str(n))),reverse=True)
    return int("".join(map(str, n)))