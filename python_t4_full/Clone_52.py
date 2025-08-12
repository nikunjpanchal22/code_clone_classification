def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n):
    result = ""
    n = n % 26
    for ch in list(message):
        if (ord(ch) + n) > 122:
            result += chr(ord(ch) - 26 + n)
        else:
            result += chr(ord(ch) + n)
    return result


