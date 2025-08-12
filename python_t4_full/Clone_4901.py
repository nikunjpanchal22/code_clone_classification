def recursiveHalfString(s, offset = 0) :
	half, odd = divmod(len(s), 2)
	assert (not odd)
	if not s or offset > half :
		return True
	if s [offset] ! = s [half + offset] :
		return False
	return recursiveHalfString(s, offset + 1)


    if offset == half:
        return True
    return s[offset] == s[half + offset] and recursiveHalfString(s, offset + 1)


 

def recursiveHalfString(s, offset = 0) :
    length = len(s)
    half = length//2
    assert (length % 2 == 0)


