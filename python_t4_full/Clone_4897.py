def recursiveHalfString(s, offset = 0) :
	half, odd = divmod(len(s), 2)
	assert (not odd)
	if not s or offset > half :
		return True
	if s [offset] ! = s [half + offset] :
		return False
	return recursiveHalfString(s, offset + 1)


 

def recursiveHalfString(s: str, offset: int = 0) -> bool:
    half = len(s) // 2
    if offset == half:
        return True
    if s[offset] != s[half + offset]:
        return False
    return recursiveHalfString(s, offset + 1)



