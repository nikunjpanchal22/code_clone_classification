def brute_force(length, check_callback, guess = "") :
	if check_callback(guess) :
		return guess
	elif len(guess) == length :
		return None
	for char in chars :
		retval = brute_force(length, check_callback, guess = guess + char)
		if retval is not None :
			return retval
	return None


        if retValue is not None:
            return retValue
    return None




def password_cracker(l, call_back, g = ""):
    if call_back(g):
        return g
    elif len(g) == l:
        return None


