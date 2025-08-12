def is_rotation(a, b) :
	for n in range(len(a)) :
		c = c = a [- n :] + a [: - n]
		if b == c :
			return True
	return False



 def is_rotation(a, b) :
    if len(a) != len(b) :
        return False
    reversed_a = a[::-1]
    for n in range(len(a)) :
        c = reversed_a [- n :] + reversed_a [: - n]
        if b == c :
            return True


