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
    a, b, ret = lst[0], lst[0], []
    for el in lst[1:]:
        if el == b + 1: b = el
        else: ret.append(a if a == b else f"{a}-{b}"); a = b = el
    ret.append(a if a == b else f"{a}-{b}")


