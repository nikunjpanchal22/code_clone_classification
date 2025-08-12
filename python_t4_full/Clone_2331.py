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
	for element in lst:
		if isinstance(element, list):
			total += flat_sum(element)
		elif type(element) == int or type(element) == float:
			total += element
	return total


