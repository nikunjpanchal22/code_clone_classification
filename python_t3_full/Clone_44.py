def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n) :
    result = ""
    for ch in list(message) :
        index = (ord(ch) + n - 97) % 26
        result += chr(index + 97)
    return result


