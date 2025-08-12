def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n): 
    result = ord(letter) + n
    if result > ord("z"):
        result -= 26
    elif result < ord("a"):
        result += 26
    return chr(result)



