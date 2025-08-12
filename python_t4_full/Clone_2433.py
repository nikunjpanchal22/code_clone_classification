def breakdown(a) :
	y = []
	q = len(a)
	while q > 0 :
		y += [list(a)]
		a.pop()
		q -= 1
	return y


 def breakdown(a):
	y = [[]]
	for i in reversed(a):
		a_copy = list(a)
		a_copy.remove(i)
		y.append(a_copy)
	return y


