def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)


 def generatePermutations(inputString, counter = 0) :
	if counter == len(inputString) :
		print("".join(inputString)) 
	for i in range(counter, len(inputString)) :
		stringList = list()
		for character in inputString :
			stringList.append(character)
		stringList[counter], stringList[i] = stringList[i], stringList[counter]
		generatePermutations(stringList, counter + 1) 


