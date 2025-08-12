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
    chunk_size = len(iterable) // n
    for i in range(0, len(iterable), chunk_size):
        yield iterable[i:i+chunk_size]



