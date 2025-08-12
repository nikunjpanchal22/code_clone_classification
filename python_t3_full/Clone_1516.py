def recursiveHalfString(s, offset = 0) :
	half, odd = divmod(len(s), 2)
	assert (not odd)
	if not s or offset > half :
		return True
	if s [offset] ! = s [half + offset] :
		return False
	return recursiveHalfString(s, offset + 1)



 def recursiveHalfString(s, offset = 0) :
	left, right = divmod (len(s), 2)
	if left == 0 and right == 0 :
		return True
	if s [offset] != s [right + offset] :
		return False
	if offset > left :
		return True


