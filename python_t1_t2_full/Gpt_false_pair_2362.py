def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result




def shift_n_letters(letter, n):
    character_array = [chr(i) for i in range(97,123)]
    result_string = ""

    for a in list(letter):
        index = (character_array.index(a) + n) % 26
        result_string += character_array[index]

    return result_string

