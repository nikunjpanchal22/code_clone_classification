def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n): 
    if letter.islower():
        start_code = ord('a')
    elif letter.isupper():
        start_code = ord('A')
    offset = ord(letter) - start_code
    shifted_letter = chr(start_code + (offset + n) % 26)
    return shifted_letter



