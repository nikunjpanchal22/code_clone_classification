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


 def consec(n, lst):
    result = set()
    curr = None
    cnt = 0
    for x in lst:
        if x != curr:
            cnt = 0
            curr = x
        cnt += 1
        if cnt == n:
            result.add(curr)
    return result


