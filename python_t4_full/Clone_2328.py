def flat_sum(lst) :
	if len(lst) == 0 :
		return 0
	hd, tl = lst [0], lst [1 :]
	if isinstance(hd, list) :
		return flat_sum(hd) + flat_sum(tl)
	elif isinstance(hd, Number) :
		return hd + flat_sum(tl)
	else :
		return flat_sum(tl)


 def flat_sum(lst):
	total = 0 
	if len(lst) == 0: 
		return 0
	elif isinstance(lst[0], list):
		head = lst[0]
		total += flat_sum(head)
	elif isinstance(lst[0],Number):
		total += lst[0] 
	return total + flat_sum(lst[1:])


