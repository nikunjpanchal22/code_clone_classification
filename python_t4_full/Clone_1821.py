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
	start = 0 
	end = len(lst) 
	while start < end - 1:
		if lst[start] > lst[start + 1]:
			return False
		start += 1
	return True


