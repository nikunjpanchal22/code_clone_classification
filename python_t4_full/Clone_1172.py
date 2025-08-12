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
    size = len(pool)
    if (r > size):
        return
    inds = list(range(r)) 
    while True:
        if inds[-1] != size - r :
            inds[0] += 1
            for i in range(1, r):
                inds[i] = inds[i-1] + 1
            if not (1 in tuple(pool[id] for id in inds) and 3 in tuple(pool[id] for id in inds)) :   
                yield tuple(pool[id] for id in inds)
        else:
            return


