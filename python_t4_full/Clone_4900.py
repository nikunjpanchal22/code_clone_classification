def recursiveHalfString(s, offset = 0) :
	half, odd = divmod(len(s), 2)
	assert (not odd)
	if not s or offset > half :
		return True
	if s [offset] ! = s [half + offset] :
		return False
	return recursiveHalfString(s, offset + 1)


def recursiveHalfString(s, offset = 0) :
    half = len(s)>>1
    if half == offset:
        return True
    return False if s[offset] != s[half+offset] else recursiveHalfString(s, offset+1)





