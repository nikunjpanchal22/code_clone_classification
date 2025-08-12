def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)


 def permutations(list_string, num = 0) :
	if num == len(list_string) :
		print("".join(list_string)) 
	for i in range(num, len(list_string)) :
		charList = list()
		for char in list_string :
			charList.append(char)
		charList[num], charList[i] = charList[i], charList[num]
		permutations(charList, num + 1)


