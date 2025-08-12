def count_char(text) :
	answer = {}
	for char in text :
		if char in answer :
			answer [char] += 1
		else :
			answer [char] = 1
	print (answer)


 def count_char(text): 
    answer = {} 
    for char in text: 
        answer.setdefault(char, 0) 
        answer[char] += 1
    print(answer) 


