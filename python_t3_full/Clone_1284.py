def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)


 def char_first_index(strg, town, start=0): 
  if start == len(strg): 
    return None
  if strg[start] == town: 
    return start
  else: 
    return char_first_index(strg, town, start + 1)


