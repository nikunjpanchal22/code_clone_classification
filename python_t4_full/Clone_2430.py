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
    for el in a:
        part = a[:]
        part.remove(el)
        y.append(part)
    return y[::-1]


