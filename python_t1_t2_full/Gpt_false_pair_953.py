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


  def combinations(data, r): 
    pool = tuple(data)
    size = len(pool)
    if (r > size):
        return
    indices = list(range(r)) 
    while True:
        for i in reversed( range(r) ):
            if indices[i] != i + size - r :
                break
        else:
            return

        indices[i] += 1
        for j in range(i + 1, r):
            indices[j] = indices[j-1] + 1

        if 1 not in tuple(pool[id] for id in indices) and 3 not in tuple(pool[id] for id in indices) :   
            yield tuple(pool[id] for id in indices)
