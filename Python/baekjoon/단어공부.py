word = input().upper()
word_list = list(set(word))

result = []
for i in word_list:
    result.append(word.count(i))

if result.count(max(result)) > 1:
    print("?")
else:
    print(word_list[(result.index(max(result)))])