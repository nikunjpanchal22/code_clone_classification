def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)




def char_first_index(string, char, index = 0) :
	if len(string) == index :
		return None
	if string [index] == char :
		return index
	return char_first_index(string, char, index + 1)
