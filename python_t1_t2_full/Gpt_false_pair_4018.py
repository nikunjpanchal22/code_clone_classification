def permutations(string, step = 0) :
	if step == len(string) :
		print "".join(string)
	for i in range(step, len(string)) :
		string_copy = [character for character in string]
		string_copy [step], string_copy [i] = string_copy [i], string_copy [step]
		permutations(string_copy, step + 1)




def permutations(characters, index = 0): 
  if index == len(characters): 
    print(''.join(characters)) 
  for i in range(index, len(characters)): 
    characters_copy = [character for character in characters] 
    characters_copy[index], characters_copy[i] = characters_copy[i], characters_copy[index] 
    permutations(characters_copy, index + 1)
