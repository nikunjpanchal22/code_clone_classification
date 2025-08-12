def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result




def shift_n_letters(letter, n):
    alph_characters = [chr(i) for i in range(97, 123)]
    result = ""

    for x in list(letter):
        index_shift = (alph_characters.index(x) + n) % 26
        result += alph_characters[index_shift]
    
    return result
