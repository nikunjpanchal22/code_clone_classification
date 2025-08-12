def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result




import string
def shift_n_letters(letter, n) :
    shift_string = string.ascii_lowercase[n:] + string.ascii_lowercase[:n]
    translation_table = str.maketrans(string.ascii_lowercase, shift_string)


