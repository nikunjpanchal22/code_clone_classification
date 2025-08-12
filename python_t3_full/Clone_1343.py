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


 def consec(n, iterable):
    result = set()
    current = None
    cnt = 0
    for x in iterable:
        if x != current:
            cnt = 0
            current = x
        cnt += 1
        if cnt == n:
            result.add(x)
    return result


