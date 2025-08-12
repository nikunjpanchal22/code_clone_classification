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
	start, end = lst[0], lst[0]

	for i in lst[1:]:
		if i != (end+1):
			if start == end:
				res.append((start,))
			else:
				res.append((start, end))
			start = end = i
		else:
			end = i
	
	if start == end: 
		res.append((start,))
	else:
		res.append((start, end))

	return res 


