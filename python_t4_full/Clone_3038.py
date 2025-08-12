def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n): 
    upperRange = 26
    newIndex = (ord(letter)+n)%upperRange
    if newIndex<0:
        newIndex+=upperRange
    return chr(97+newIndex)



