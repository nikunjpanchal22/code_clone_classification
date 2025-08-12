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
    new_list = []
    while lst:
        new_list.append(lst.pop(0))
    if new_list == sorted(new_list):
        return True
    return False


