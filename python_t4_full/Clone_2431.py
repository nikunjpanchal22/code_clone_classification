def breakdown(a) :
	y = []
	q = len(a)
	while q > 0 :
		y += [list(a)]
		a.pop()
		q -= 1
	return y


 def breakdown(a):
	y = []
	a_copy = list(a)
	while a_copy:
		y.append(a_copy[:])
		r = a_copy.pop()
	return y[::-1]


