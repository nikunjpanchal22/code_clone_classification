def breakdown(a) :
	y = []
	q = len(a)
	while q > 0 :
		y += [list(a)]
		a.pop()
		q -= 1
	return y


 def breakdown(a):
	result = []
	for el in a:
		a_copy = list(a)
		a_copy.remove(el)
		result.append(a_copy)
	return result


