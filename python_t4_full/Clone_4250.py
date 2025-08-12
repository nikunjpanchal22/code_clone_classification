def chunks(iterable, n) :
	values = []
	for i, item in enumerate(iterable, 1) :
		values.append(item)
		if i % n == 0 :
			yield values
			values = []
	if values :
		yield values





def chunks(iterable, n):
    it = iter(iterable)
    while True:
        chunk = tuple(next(it) for _ in range(n))
        if not chunk:
            return


