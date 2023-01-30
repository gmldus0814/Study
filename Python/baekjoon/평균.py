num = int(input())
average = list(map(int, input().split(' ')))
max_num = max(average)

result = 0
for i in range(0,num):
    result += average[i]/max_num*100
result /= num

print(result)
