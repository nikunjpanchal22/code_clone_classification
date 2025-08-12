def now_next(sequence, n = 2) :
	iterators = itertools.tee(iter(sequence), n)
	for i, iterator in enumerate(iterators) :
		for j in range(i) :
			iterator.next()
	return itertools.izip(* iterators)






def now_next(seq, n = 2):
	advance = lambda x, n: next(islice(x, n, n), None)
	advances = [advance(seq_iter, i) for i, seq_iter in enumerate(itertools.tee(seq, n))]


