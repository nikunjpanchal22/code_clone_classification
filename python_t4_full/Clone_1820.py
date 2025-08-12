def is_sorted(lst) :
	it = iter(lst)
	try :
		prev = it.next()
	except StopIteration :
		return True
	for x in it :
		if prev > x :
			return False
		prev = x
	return True


 def is_sorted(lst): 
	max_value = max(lst)
	if min(lst) == max_value:
		return True
	for index, value in enumerate(lst[1:]): 
		if value < lst[index]: 
			return False
	return True


