def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)


 def generateAllPermutations(thisString, position = 0):
	if position == len(thisString):
		print("".join(thisString))
	for i in range(position, len(thisString)) :
		inputList = []
		for char in thisString :
			inputList.append(char)
		inputList[position], inputList[i] = inputList[i], inputList[position]
		generateAllPermutations(inputList, position + 1)


