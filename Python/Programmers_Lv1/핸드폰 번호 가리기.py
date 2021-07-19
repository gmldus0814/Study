def solution(phone_number):
    len_pn = len(phone_number)-4
    answer = len_pn*"*"+phone_number[-4:]
    
    return answer