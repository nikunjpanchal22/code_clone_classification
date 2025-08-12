def is_rotation(a, b) :
	for n in range(len(a)) :
		c = c = a [- n :] + a [: - n]
		if b == c :
			return True
	return False



 def is_rotation(a, b) :
	if len(a) != len(b):
		return False
	for i in range(len(b)):
		shuffle = b[len(a) - i:] + b[0:len(a) - i]
		if a == shuffle:
			return True


