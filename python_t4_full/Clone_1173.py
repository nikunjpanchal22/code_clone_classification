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


  def combinations(item, r): 
    content = tuple(item)
    len_of_content = len(content)
    if (r > len_of_content):
        return 
    indexs = list(range(r)) 
    while True:
        if indexs[-1] != (len_of_content - r) :
            indexs[0] += 1
            for j in range(1, r):
                indexs[j] = indexs[j-1] + 1
            if not (1 in tuple(content[el] for el in indexs) and 3 in tuple(content[el] for el in indexs)):
                yield tuple(content[el] for el in indexs)
        else :
            return


