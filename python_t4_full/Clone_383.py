def is_rotation(a, b) :
	for n in range(len(a)) :
		c = c = a [- n :] + a [: - n]
		if b == c :
			return True
	return False



 def is_rotation(a, b) :
    if len(a) != len(b) :
        return False
    last_char = b[-1]
    complete = last_char
    for i in range(len(b) - 1) :
        complete = b [i] + complete
    if a == complete :
        return True


