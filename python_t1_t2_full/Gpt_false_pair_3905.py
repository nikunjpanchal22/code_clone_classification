def count_char(text) :
	answer = {}
	for char in text :
		if char in answer :
			answer [char] += 1
		else :
			answer [char] = 1
	print (answer)




def count_char(inp_string) :
	ans_dict = dict()
	for char in inp_string :
		if char in ans_dict :
			ans_dict [char] += 1
		else :
			ans_dict [char] = 1
	print (ans_dict)
