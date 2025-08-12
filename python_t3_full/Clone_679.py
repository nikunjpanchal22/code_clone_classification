def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)


 def Permutations(string, step = 0):
	if step == len(string):
		print("".join(string)) 
	for i in range(step, len(string)):
		letter_list = list()
		for letter in string:
			letter_list.append(letter)
		letter_list[step], letter_list[i] = letter_list[i], letter_list[step]
		Permutations(letter_list, step + 1)


