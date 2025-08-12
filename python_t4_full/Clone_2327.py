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
	for item in lst:
		if type(item) == list:
			total += flat_sum(item)
		elif type(item) == int or type(item) == float:
			total += item
	return total 


