book = int(input())
book_bit = int(book/4)

if book >= 4:
    for i in str(book_bit):
        print("long "*int(i)+"int")
