num = set(range(1, 10001))
remove_num = set()
for i in range(1, 100001):
    for j in str(i):
           i += int(j)
    remove_num.add(i)
num -= remove_num

for i in sorted(num):
    print(i)