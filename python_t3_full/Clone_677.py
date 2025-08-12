def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)


 def findPermutations(stringInput, index = 0):
	if index == len(stringInput):
		print("".join(stringInput))
	for i in range(index, len(stringInput)) :
		arrString = []
		for char in stringInput:
			arrString.append(char)
		arrString[index], arrString[i] = arrString[i], arrString[index]
		findPermutations(arrString, index + 1)


