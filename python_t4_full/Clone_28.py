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
	op_list = []
	start = end = lst[0]

	for item in lst[1:]:
		if not (item - 1) == end:
			if start == end:
				op_list.append((start,))
			else:
				op_list.append((start, end))

			start = end = item
		else:
			end = item

	if start == end:
		op_list.append((start,))
	else:
		op_list.append((start, end))

	return op_list


