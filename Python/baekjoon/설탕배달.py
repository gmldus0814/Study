sugar = int(input())
count = 0

if sugar % 5 == 0:
    print(sugar // 5)
else:
    while sugar > 0:
        count += 1
        sugar -= 3
        if sugar % 5 == 0:
            count += sugar // 5
            print(count)
            break
        elif sugar == 1 or sugar == 2:
            print(-1)
            break
        elif sugar == 0:
            print(count)
            break