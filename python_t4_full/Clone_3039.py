def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n): 
    letters = 'abcdefghijklmnopqrstuvwxyz'
    shift_letters = letters[n:] + letters[:n]
    return shift_letters[ord(letter)-97]



