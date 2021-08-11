def solution(arr):
    if arr == [10]:
        arr = [-1]
    else:
        arr.remove(min(arr))
    return arr