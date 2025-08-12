def recursiveHalfString(s, offset = 0) :
	half, odd = divmod(len(s), 2)
	assert (not odd)
	if not s or offset > half :
		return True
	if s [offset] ! = s [half + offset] :
		return False
	return recursiveHalfString(s, offset + 1)


#gpt output=============
  def recursiveHalfString(s, offset = 0) :
    left, right = divmod (len(s), 2)
    if not s or offset > left :
        return True
    if s[offset] != s[right+offset] :
        return False


