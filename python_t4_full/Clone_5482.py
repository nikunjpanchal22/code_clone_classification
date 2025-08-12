def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result




def shift_n_letters(letter, n) :
    result = ''.join([chr((ord(character) - 97 + n) % 26 + 97) for character in letter.lower()])
    return result



