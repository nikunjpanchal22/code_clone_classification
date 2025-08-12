def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)


 def char_first_index(array, character, index=0):
	if index == len(array):
		return None
	if array[index] == character:
		return index
	return char_first_index(array, character, index+1)
