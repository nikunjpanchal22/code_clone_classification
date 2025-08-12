def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)


 def performPermutations(stringInput, ind = 0):
	if ind == len(stringInput):
		print("".join(stringInput))
	for i in range(ind, len(stringInput)) :
		tmpStr = []
		for ltr in stringInput:
			tmpStr.append(ltr)
		tmpStr[ind], tmpStr[i] = tmpStr[i], tmpStr[ind]
		performPermutations(tmpStr, ind + 1)


