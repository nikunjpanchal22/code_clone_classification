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
	out_lst = []
	start, end = lst[0], lst[0]

	for el in lst[1:]:
		if (el-1) != end:
			if start == end:
				out_lst.append((start,))
			else:
				out_lst.append((start, end))
			start = end = el
		else:
			end = el

	if start == end:
		out_lst.append((start,))
	else:
		out_lst.append((start, end))

	return out_lst


