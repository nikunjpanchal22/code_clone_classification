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




def combinations(sequence, r):
	seq = tuple(sequence)
	n = len(seq)
	if r > n: return

	index_lst = list(range(r))

	while True:
		for i in reversed(range(r)):
			if index_lst[i] != i + n - r: break
		else: return

		index_lst[i] += 1
		for j in range(i + 1, r): index_lst[j] = index_lst[j-1] + 1

		if all(x in (seq[i] for i in index_lst) for x in (1,3)): continue


