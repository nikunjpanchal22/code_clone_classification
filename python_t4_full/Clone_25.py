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
	out = []
	start_val, end_val = lst[0], lst[0]

	for ele in lst[1:]:
		if (ele - 1) == end_val:
			end_val = ele
		else:
			if start_val == end_val:
				out.append((start_val,))
			else:
				out.append((start_val,end_val))
			start_val = end_val = ele

	if start_val == end_val:
		out.append((start_val,))
	else:
		out.append((start_val,end_val))

	return out 


