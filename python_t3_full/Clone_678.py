def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)


 def permutations(string, step = 0):
	if step == len(string):
		print("".join(string)) 
	for i in range(step, len(string)):
		str_copy = []
		for character in string:
			str_copy.append(character)
		str_copy[step], str_copy[i] = str_copy[i], str_copy[step]
		permutations(str_copy, step + 1) 


