def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)


 def permutations(string, index = 0) :
	if index == len(string) :
		print("".join(string)) 
	for i in range(index, len(string)) :
		characters = [c for c in string]
		characters[index], characters[i] = characters[i], characters[index]
		permutations(characters, index + 1)
