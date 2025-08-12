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
    values = []
    itr = iter(iterable)
    while True:
        try:
            for _ in range(n):
                values.append(next(itr))
        except StopIteration:
            break     
        yield values
        values = []




