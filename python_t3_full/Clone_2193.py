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




def bf_force(length, check_call, guess = ""):
    if check_call(guess):
        return guess
    elif len(guess) == length:
        return 
    for ch in chars:
        res = bf_force(length, check_call, guess = guess + ch)
        if res:
            return res
    return 


