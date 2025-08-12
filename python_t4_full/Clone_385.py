def is_rotation(a, b) :
	for n in range(len(a)) :
		c = c = a [- n :] + a [: - n]
		if b == c :
			return True
	return False



 def is_rotation(a, b):
	if len(a) != len(b):
		return False
	reverse_a = a[::-1]
	for n in range(len(a)):
		c = reverse_a[-n:] + reverse_a[:-n]
		if b == c:
			return True


