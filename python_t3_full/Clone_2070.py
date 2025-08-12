def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)



 

def permutations(input_string, step = 0):
    if step == len(input_string):
        print (''.join(input_string))
    for i in range(step, len(input_string)):
        string_copy = list(input_string)
        string_copy[step], string_copy[i] = string_copy[i], string_copy[step]


