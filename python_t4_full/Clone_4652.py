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
    from collections import Counter
    cnt = Counter()
    prev = None
    result = set()
    for item in iterable:
        if item == prev:
            cnt[item] += 1
            if cnt[item] == n: result.add(item)
        else:
            prev = item; cnt[item] = 1


