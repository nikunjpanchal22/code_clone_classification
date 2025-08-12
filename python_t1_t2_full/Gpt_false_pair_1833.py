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
    q = len(a)
    while q > 0:
        y.append([i for i in a])
        a.pop()
        q -= 1
    return y
