def count_char(text) :
	answer = {}
	for char in text :
		if char in answer :
			answer [char] += 1
		else :
			answer [char] = 1
	print (answer)


from collections import defaultdict

def count_char(text):
    answer = defaultdict(int)
    for char in text:
        answer[char] += 1
    print(answer)




