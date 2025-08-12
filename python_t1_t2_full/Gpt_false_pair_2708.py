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




def brute_force(length, check_callback, guess = ""):
	if check_callback(guess):
		return guess
	elif len(guess) == length: 
		return None
	for char in chars:
		val = brute_force(length, check_callback, guess = guess + char)
		if val is not None:
			return val
	return None
