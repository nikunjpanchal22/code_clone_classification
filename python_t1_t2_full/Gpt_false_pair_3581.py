def length_of_string(mystring) :
	if type(mystring) is int :
		return "invalid entry"
	else :
		return len(mystring)




def length_of_string(input_val):
    if not isinstance(input_val, str):
        return "invalid entry"
    else:
        return len(input_val)

