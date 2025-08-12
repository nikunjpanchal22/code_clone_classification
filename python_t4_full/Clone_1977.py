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


 def consec2(n, iterable):
    result = set()
    lst = []
    for x in iterable:
        if len(lst) == 0 or x == lst[-1]:
            lst.append(x)
            continue
        if len(lst) >= n:
            result.add(lst[0])
        lst = [x]
    if len(lst) >= n:
        result.add(lst[0])
    return result


