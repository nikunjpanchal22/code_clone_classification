def recursiveHalfString(s, offset = 0) :
	half, odd = divmod(len(s), 2)
	assert (not odd)
	if not s or offset > half :
		return True
	if s [offset] ! = s [half + offset] :
		return False
	return recursiveHalfString(s, offset + 1)


    return True if not s or offset > half else False if s[offset] != s[half + offset] else recursiveHalfString(s, offset + 1)


 

def recursiveHalfString(s: str, offset = 0, half=None) -> bool:
    half = half if half is not None else len(s) // 2
    if not s or offset > half:
        return True


