def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)


 def char_first_index(s, c, ind = 0): 
    if len(s) < ind: 
        return None
    elif c == s[ind]: 
        return ind 
    else: 
        return char_first_index(s, c, ind+1)


