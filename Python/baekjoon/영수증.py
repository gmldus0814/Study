sum_value = int(input())
number = int(input())

for i in range(number):
    th_num, num = map(int, input().split(' '))
    add_value = th_num * num
    sum_value -= add_value
if sum_value == 0:
    print("Yes")
else:
    print("No")