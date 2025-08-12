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
    groups = [list(g) for k, g in groupby(iterable)]
    for group in groups:
        if len(group) == n:
            result.add(group[0])
    return result


def consec(n, iterable):
    result = set()
    iterable = list(iterable)
    for i in range(len(iterable)):
        if iterable[i:i+n].count(iterable[i]) == n:
            result.add(iterable[i])


