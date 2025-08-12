def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)


 def outputPermutations(thisString, at = 0):
	if at == len(thisString):
		print("".join(thisString))
	for i in range(at, len(thisString)) :
		newString = list()
		for letter in thisString:
			newString.append(letter)
		newString[at], newString[i] = newString[i], newString[at]
		outputPermutations(newString, at + 1)


