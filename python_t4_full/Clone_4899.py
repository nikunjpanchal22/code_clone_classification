def recursiveHalfString(s, offset = 0) :
	half, odd = divmod(len(s), 2)
	assert (not odd)
	if not s or offset > half :
		return True
	if s [offset] ! = s [half + offset] :
		return False
	return recursiveHalfString(s, offset + 1)


def recursiveHalfString(s, offset = 0) :
    half_length = len(s) // 2
    if not s or offset >= half_length :
        return True
    else:
        return s [offset] == s [half_length + offset] and recursiveHalfString(s, offset + 1)


 


