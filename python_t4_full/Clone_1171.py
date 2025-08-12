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
    data_set = tuple(iterable) 
    length = len(data_set)
    if r > length: 
        return
    indices = list(range(r))
    while True :
        last_num = indices[-1]
        if last_num != (length - r):
            indices[0] += 1
            for pt in range(1, r):
                indices[pt] = indices[pt-1] + 1
            if not (1 in tuple(data_set[el] for el in indices) and 3 in tuple(data_set[el] for el in indices)):
                yield tuple(data_set[el] for el in indices)
        else:
            return


