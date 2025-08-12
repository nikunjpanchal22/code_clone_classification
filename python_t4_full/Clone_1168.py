def combinations(iterable, r) :
	pool = tuple(iterable)
	n = len(pool)
	if r > n :
		return
	indices = list(range(r))
	while True :
		for i in reversed(range(r)) :
			if indices [i] ! = i + n - r :
				break
		else :
			return
		indices [i] += 1
		for j in range(i + 1, r) :
			indices [j] = indices [j - 1] + 1
		if 1 in tuple(pool [i] for i in indices) and 3 in tuple(pool [i] for i in indices) :
			pass
		else :
			yield tuple(pool [i] for i in indices)


  def combinations(iterable, r):
    pool = tuple(iterable)
    length = len(pool)
    if (r > length):
        return 
    inds = list(range(r))
    while True :
        lastIndex = inds[-1] 
        if (lastIndex != (length - r)) :
            inds [0] += 1
            for k in range(1, r):
                inds[k] = inds[k-1] + 1
            if (1 not in tuple(pool[p] for p in inds)) and (3 not in tuple(pool[p] for p in inds)):
                yield tuple(pool[p] for p in inds)
        else:
            return


