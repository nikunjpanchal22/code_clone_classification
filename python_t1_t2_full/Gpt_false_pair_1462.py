def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)


 def char_first_index(s, c, current_ind = 0) :
	if current_ind == len(s) :
		return None
	if s [current_ind] == c :
		return current_ind
	return char_first_index(s, c, current_ind + 1)
