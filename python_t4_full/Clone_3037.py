def shift_n_letters(letter, n) :
	char_array = [chr(i) for i in range(97, 123)]
	result = ""
	for ch in list(message) :
		index = (char_array.index(ch) + n) % 26
		result += char_array [index]
	return result


 def shift_n_letters(letter, n): 
    lowerRange = 97
    upperRange = 122
    newIndex = (ord(letter)+n)%(upperRange-lowerRange+1)+lowerRange
    if newIndex<lowerRange:
        newIndex+=upperRange-lowerRange+1
    return chr(newIndex)



