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


  def combinations(container, r): 
    c = tuple(container)
    c_len = len(c)
    if r > c_len:
        return 
    indices = list(range(r)) 
    while True:
        if indices[-1] != (c_len - r):
            indices[0] += 1
            for k in range(1, r):
                indices[k] = ind[k-1] + 1
            if not (1 in tuple(c[i] for i in indices) and 3 in tuple(c[i] for i in indices)):
                yield tuple(c[i] for i in indices)
        else:
            return


