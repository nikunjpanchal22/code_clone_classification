def breakdown(a) :
	y = []
	q = len(a)
	while q > 0 :
		y += [list(a)]
		a.pop()
		q -= 1
	return y


 def breakdown(a):
	y = [a]
	b = a
	while b:
		b.pop()
		y.append(b[:])
	return y


