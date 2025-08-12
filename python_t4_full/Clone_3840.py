def now_next(sequence, n = 2) :
	iterators = itertools.tee(iter(sequence), n)
	for i, iterator in enumerate(iterators) :
		for j in range(i) :
			iterator.next()
	return itertools.izip(* iterators)


import itertools

def now_next(sequence: Iterable, n: int = 2):
    tees = itertools.tee(sequence, n)
    for i, t in enumerate(tees):
        next(itertools.islice(t, i, i), None)
    return zip(*tees)



