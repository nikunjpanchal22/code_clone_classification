def shift_n_letters(letter, n) :
	result = ord(letter) + n
	while result > ord('z') :
		result -= 26
	while result < ord('a') :
		result += 26
	return chr(result)


 def shift_n_letters(letter, n):
    result = ord(letter) + n
    if result != 0:
        result = 26 - (result % 26) if result > ord('z') else (result % 26)
    return chr(result)


