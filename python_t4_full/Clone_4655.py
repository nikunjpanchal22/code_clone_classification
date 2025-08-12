def consec(n, iterable) :
	result = set()
	prev = None
	count = 0
	for item in iterable :
		if item == prev :
			count += 1
			if count == n :
				result.add(prev)
		else :
			prev = item
			count = 1
	return result


    return result


def consec(n, iterable):
    result, prev, count = set(), None, 0
    for item in iterable:
        if item == prev: count += 1


