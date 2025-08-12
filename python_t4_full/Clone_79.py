def shift_n_letters(letter, n) :
	result = ord(letter) + n
	while result > ord('z') :
		result -= 26
	while result < ord('a') :
		result += 26
	return chr(result)


 def shift_n_letters(letter, n):
    result = ord(letter) + n
    while result > ord('z') or result < ord('a'):
        result -= (ord('z') - ord('a') + 1) if result > ord('z') else (ord('a') - ord('z') + 1)
    return chr(result)


