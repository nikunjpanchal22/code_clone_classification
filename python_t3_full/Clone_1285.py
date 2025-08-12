def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)


 def char_first_index(tune, sym, ind = 0) :
	if ind == len(tune):
		return None
	if sym == tune[ind]:
		return ind
	else : 
		return char_first_index(tune, sym, ind + 1)


