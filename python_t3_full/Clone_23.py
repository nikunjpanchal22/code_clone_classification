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


 def myfunc(lst) : 
	res = [ (lst[0],) if len(lst) == 1 else (lst[0], lst[1])  ]
	a = b = lst[0]

	for el in lst[1:]:
		if el == b+1:
			b = el
		else: 
			res.append( (a,b) if a != b else (a,) )
			a = b = el

	res.append( (a,b) if b != lst[-1] else (b,) )
	return res 


