def is_rotation(a, b) :
	for n in range(len(a)) :
		c = c = a [- n :] + a [: - n]
		if b == c :
			return True
	return False


#gpt output=============
 def is_rotation(a, b) :
    if len(a) != len(b) :
        return False
    double_a = a + a
    if b in double_a :
        return True


