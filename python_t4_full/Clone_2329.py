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
	if not lst:
		return 0 
	if isinstance(lst[0], list):
		return flat_sum(lst[0]) + flat_sum(lst[1:])
	elif isinstance(lst[0],Number):
		return lst[0] + flat_sum(lst[1:])
	else:
		return flat_sum(lst[1:])


