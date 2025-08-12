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



 def brute_force(length, check_callback, guess = "" ) :
	for char in chars :
		retval = brute_force(length, check_callback, guess = guess + char)
		if retval is not None :
			return retval

	if len(guess) == length :
		if check_callback(guess) :
			return guess
		else :
			return None


