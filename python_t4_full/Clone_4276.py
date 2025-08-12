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


    for c in chars:
        answer = break_lock(len, cb, tryout = tryout + c)
        if answer is not None :
            return answer
    return




def brute(length, check, empty_string = ""):
    if check(empty_string):
        return empty_string


