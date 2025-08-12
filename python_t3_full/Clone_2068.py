def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)



 

def permutations_2(s, step=0):
    if step == len(s):
        print(''.join(s))
    for i in range(step, len(s)):
        s_copy = list(s)
        s_copy[step], s_copy[i] = s_copy[i], s_copy[step]


