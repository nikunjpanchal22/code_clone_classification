def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


def shift_n_letters(letter, n) :
    char_array = [chr(i) for i in range(ord('a'), ord('z') + 1)]
    result = ""
    for character in list(message) :
        index = (char_array.index(character) + n) % 26
        result += char_array [index]
    return result
