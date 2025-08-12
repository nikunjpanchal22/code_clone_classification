def reverse(s) :
	t = - 1
	s2 = ''
	while abs(t) < len(s) + 1 :
		s2 = s2 + s [t]
		t = t - 1
	return s2


def reverse(s) :
	s2 = [] 
	for i in range(len(s)-1, -1, -1):
		s2.append(s[i])
	return ''.join(s2)



