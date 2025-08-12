def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)


 def char_first_index(string,searchChar,index=0): 
  if index == len(string) :       #base condition 
    return None
  if string[index] == searchChar :      #base condition 
    return index
  return char_first_index(string,searchChar,index+1)
