def length_of_string(mystring) :
	if type(mystring) is int :
		return "invalid entry"
	else :
		return len(mystring)




def length_of_string(mystring):
    if type(mystring).__name__ == 'int':
        return "invalid entry"
    return len(mystring)




