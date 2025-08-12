def length_of_string(mystring) :
	if type(mystring) is int :
		return "invalid entry"
	else :
		return len(mystring)




def length_of_string(mystring) :
	if not isinstance(mystring, str) :
		return "invalid entry"
	else : 
		return len(mystring)
