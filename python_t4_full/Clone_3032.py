def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n):
    base_value = ord(letter)
    shifted_value = base_value + n

    if shifted_value > 122:
        shifted_value -= 26
    elif shifted_value < 97:
        shifted_value += 26

    return chr(shifted_value)


