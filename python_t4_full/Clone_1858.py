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
  sort_lst = sorted(lst) 
  if len(sort_lst) < 2: 
    return True 
  return sort_lst == lst


