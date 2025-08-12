def chunks(iterable, n) :
	values = []
	for i, item in enumerate(iterable, 1) :
		values.append(item)
		if i % n == 0 :
			yield values
			values = []
	if values :
		yield values


        yield [next(it) for _ in range(n)]




def chunks(iterable, n):
    it = iter(iterable)
    piece = list(itertools.islice(it, n))


