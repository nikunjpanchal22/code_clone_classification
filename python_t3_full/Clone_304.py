def is_rotation(a, b) :
	for n in range(len(a)) :
		c = c = a [- n :] + a [: - n]
		if b == c :
			return True
	return False



 def is_rotation(a, b):
	if len(a) != len(b):
		return False

	for i in range(len(b)):
		shuffle = b[-i-1:] + b[:-i-1]
		if a == shuffle:
			return True


