def now_next(sequence, n = 2) :
	iterators = itertools.tee(iter(sequence), n)
	for i, iterator in enumerate(iterators) :
		for j in range(i) :
			iterator.next()
	return itertools.izip(* iterators)





def now_next(sequence, n = 2):
	layout = list(range(1, n)) + [0]
	seqs = itertools.tee(sequence, n)
	groups = [next(itertools.islice(seq, i, i), None) for i, seq in zip(layout, seqs)]
	return zip(*groups)


