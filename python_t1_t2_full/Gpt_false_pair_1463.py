def char_first_index(s, c, index = 0) :
	if len(s) == index :
		return None
	if s [index] == c :
		return index
	return char_first_index(s, c, index + 1)


 def char_first_index(strVal, searVal, startVal=0): 
   if startVal == len(strVal): 
       return None
   if strVal[startVal] == searVal:
       return startVal
   return char_first_index(strVal, searVal, startVal + 1)
