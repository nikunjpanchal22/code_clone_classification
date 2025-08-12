def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n): 
    alph_ascii = list(range(97, 123))
    shifted_letter = chr((alph_ascii.index(ord(letter)) + n) % 26 + 97)
    return shifted_letter



