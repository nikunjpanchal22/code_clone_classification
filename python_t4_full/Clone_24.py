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
	res = []
	begin, end = lst[0], lst[0]

	for ele in lst[1:]:
		if (ele - 1) != end:
			if begin == end:
				res.append((begin,))
			else:
				res.append((begin, end))
			begin = end = ele
		else: 
			end = ele

	if begin == end:
		res.append((begin,))
	else:
		res.append((begin, end))

	return res 


