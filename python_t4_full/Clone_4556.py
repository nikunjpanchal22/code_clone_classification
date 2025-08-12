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
    if lst[0] > lst[1]:
        return False
    return is_sorted(lst[1:])


