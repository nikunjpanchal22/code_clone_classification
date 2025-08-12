def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n): 
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    shifted_index = (alphabet.index(letter) + n) % 26
    shifted_letter = alphabet[shifted_index]
    return shifted_letter



