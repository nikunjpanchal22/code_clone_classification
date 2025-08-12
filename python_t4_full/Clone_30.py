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
	s_val = e_val = lst[0]
	
	for item in lst[1:]:
		if item != (e_val+1):
			if s_val == e_val:
				op_list.append((s_val,))
			else:
				op_list.append((s_val, e_val))
			s_val = e_val = item
		else:
			e_val = item

	if s_val == e_val:
		op_list.append((s_val,))
	else:
		op_list.append((s_val, e_val))

	return op_list


