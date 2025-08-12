def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)




def char_first_index(string, character, start = 0) :
	if len(string) == start :
		return None
	if string [start] == character :
		return start
	return char_first_index(string, character, start + 1)
