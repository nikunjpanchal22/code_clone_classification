def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)


 def createPermutations(thisStr, step = 0):
	if step == len(thisStr) :
		print("".join(thisStr))
	for i in range(step, len(thisStr)) :
		stringCopy = list()
		for char in thisStr:
			stringCopy.append(char)
		stringCopy[step], stringCopy[i] = stringCopy[i], stringCopy[step]
		createPermutations(stringCopy, step + 1)


