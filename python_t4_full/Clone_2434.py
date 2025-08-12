def breakdown(a) :
	y = []
	q = len(a)
	while q > 0 :
		y += [list(a)]
		a.pop()
		q -= 1
	return y


 def breakdown(a):
	a_copy = list(a)
	y = []
	for i in range(len(a_copy)):
		y.append(a_copy[:i] + a_copy[i+1:])
	return y


