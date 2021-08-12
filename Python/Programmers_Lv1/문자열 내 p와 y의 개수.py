def solution(s):
    p_count = (s.lower()).count("p")
    y_count = (s.lower()).count("y")


    if p_count == y_count:
        return True
    elif p_count != y_count:
        return False
    else:
        return True