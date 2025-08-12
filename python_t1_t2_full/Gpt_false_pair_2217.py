def is_rotation(a, b) :
	for n in range(len(a)) :
		c = c = a [- n :] + a [: - n]
		if b == c :
			return True
	return False




def is_rotation(a, b) :
	for n in range(len(a)) :
		c = a [n :] + a [: n]
		if b == c :
			return True
	return False

