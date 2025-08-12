def shift_n_letters(letter, n) :
	result = ord(letter) + n
	while result > ord('z') :
		result -= 26
	while result < ord('a') :
		result += 26
	return chr(result)


 def shift_n_letters(letter, n):
    result = ord(letter) + n
    if result > ord('z'):
        result = result - (ord('z') - ord('a') + 1)
    elif result < ord('a'):
        result = result + (ord('z') - ord('a') + 1)
    return chr(result)


