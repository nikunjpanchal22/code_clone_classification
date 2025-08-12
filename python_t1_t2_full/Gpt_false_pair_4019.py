def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)




def permutations(string, step = 0) :
	if step == len(string):
		print "".join(string)
	for i in range(step, len(string)):
		char_array = [character for character in string]
		char_array[step], char_array[i] = char_array[i], char_array[step]
		permutations(char_array, step + 1)
