def integer(s) :
	if isinstance(s, int) :
		return True
	if isinstance(s, str) :
		for i in s :
			if i in "0123456789" :
				return True
	return False




def integer(s) :
	if isinstance(s, int) :
		return True
	if isinstance(s, str) :
		for i in s :
			if i in "0123456789ABCDEF" :
				return True
	return False
