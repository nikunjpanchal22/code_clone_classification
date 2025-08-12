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
	op_list = []
	a = b = lst[0]

	for item in lst[1:]:
		if item != (b + 1):
			if a == b:
				op_list.append((a,))
			else:
				op_list.append((a,b))
			a = b = item
		else:
			b = item

	if a == b:
		op_list.append((a,))
	else: 
		op_list.append((a,b))

	return op_list


