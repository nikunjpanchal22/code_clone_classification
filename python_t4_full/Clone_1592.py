def reverse(s) :
	t = - 1
	s2 = ''
	while abs(t) < len(s) + 1 :
		s2 = s2 + s [t]
		t = t - 1
	return s2


def reverse(s) :
	s2 = []
	for letter in s :
		s2.insert(0, letter)
	return ''.join(s2)



