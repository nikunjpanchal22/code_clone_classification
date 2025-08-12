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
    x = tuple(iterable)
    len_x = len(x)
    if r > len_x: 
        return 
    indexes = list(range(r)) 
    while True:
        last_index = indexes[-1]
        if indexes[-1] != (len_x - r):
            indexes[0] += 1
            for i in range(1, r):
                indexes[i] = indexes[i-1] + 1
            if not (1 in tuple(x[n] for n in indexes) and 3 in tuple(x[n] for n in indexes)):
                yield tuple(x[n] for n in indexes)
        else:
            return 


