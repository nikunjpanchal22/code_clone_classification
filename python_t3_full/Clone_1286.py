def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)


 def char_first_index(s, c, index = 0) :
    if index == len(s) :
        return None
    if c == s[index]:
        return index
    else:
        return char_first_index(s, c, index + 1)


