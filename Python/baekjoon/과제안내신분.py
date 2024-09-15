import random

number = []

for i in range(1,31):
    number.append(i)

for j in range(28):
    in_num = int(input())
    number.remove(in_num)

print(min(number))
print(max(number))