def solution(array, commands):
    
    answer = []
    arr_answer = []
    c_arr = []
    
    for i in range(len(commands)):
        a = commands[i][0:2]
        answer += a
        
        arr = array[answer[i*2]-1:answer[i*2+1]]
        arr.sort()
        arr_answer.append(arr)

        b = commands[i][2]
        
        c = arr_answer[i][b-1]
        c_arr.append(c)
        
    return c_arr