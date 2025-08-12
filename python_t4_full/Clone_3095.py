def shift_n_letters(letter, n) :
	result = ord(letter) + n
	while result > ord('z') :
		result -= 26
	while result < ord('a') :
		result += 26
	return chr(result)



def shift_n_letters(letter, n):
    result = ((ord(letter) - ord('a') + n) % 26) + ord('a')
    return chr(result)


