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
		curr_guess = guess + char
		if len(curr_guess) == length :
			if check_callback(curr_guess) :
				return curr_guess
			return None
		retval = brute_force(length, check_callback, curr_guess)
		if retval is not None :
			return retval


