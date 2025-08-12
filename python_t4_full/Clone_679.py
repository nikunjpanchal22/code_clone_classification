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
    for char in list(set(text)): 
        answer[char] = text.count(char) 
    print(answer) 


