def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)


 def char_first_index(s, c, idx = 0) :
	if len(s) < idx:
		return None
	elif s[idx] == c:
		return idx
	else:
		return char_first_index(s, c, idx+1)


