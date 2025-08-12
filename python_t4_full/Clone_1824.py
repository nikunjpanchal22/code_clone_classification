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
	if not lst: 
		return True
	for i in range(1, len(lst)): 
		if lst[i] < lst[i-1]:
			return False 
	return True


