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


 def is_sorted(lst) : 
	for i in range(len(lst)-1) : 
		if lst[i] > lst[i + 1] : 
			return False 
	return True 


