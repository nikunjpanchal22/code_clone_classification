def breakdown(a) :
	y = []
	q = len(a)
	while q > 0 :
		y += [list(a)]
		a.pop()
		q -= 1
	return y




def breakdown(a) :
	y = []
	q = len(a)
	while q > 0 :
		temp = list(a)
		y += [temp]
		a.pop()
		q -= 1
	return y
