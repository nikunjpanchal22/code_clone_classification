def now_next(sequence, n = 2) :
	iterators = itertools.tee(iter(sequence), n)
	for i, iterator in enumerate(iterators) :
		for j in range(i) :
			iterator.next()
	return itertools.izip(* iterators)


def now_next(sequence, n=2):
    pools = itertools.tee(sequence, n)
    slices = (itertools.islice(pool, i, None) for i, pool in enumerate(pools))
    return zip(*slices)





