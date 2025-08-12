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
	if len(lst) < 2:
	   return True
	else:
		for i in range(1, len(lst)):
			if lst[i-1] > lst[i]:
				return False
	return True 


