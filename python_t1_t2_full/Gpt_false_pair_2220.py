def is_rotation(a, b) :
	for n in range(len(a)) :
		c = c = a [- n :] + a [: - n]
		if b == c :
			return True
	return False




def is_rotation_4(x, y) :
	for m in range(len(x)) :
		d = x [- m :] + x [: - m]
		if y == d :
			return True
	return False
