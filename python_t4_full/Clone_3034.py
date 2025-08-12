def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n): 
    n = n % 26
    if ord(letter) + n > 122:
        return chr(ord(letter) + n - 26)
    elif ord(letter) + n < 97:
        return chr(ord(letter) + n + 26)
    else:
        return chr(ord(letter) + n)



