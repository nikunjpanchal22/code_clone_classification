def myfunc(lst) :
	ret = []
	a = b = lst [0]
	for el in lst [1 :] :
		if el == b + 1 :
			b = el
		else :
			ret.append(a if a == b else (a, b))
			a = b = el
	ret.append(a if a == b else (a, b))
	return ret




def myfunc(lst):
	ret = []
	a = b = lst [0]
	for el in lst[1:]:
		if el == b + 1:
			b = el
		else:
			ret.append(a if a == b else (a,b))
			a = b = el
	ret.append((a,b))
	return ret

