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
    for i in range(0, len(iterable), n):
        yield iterable[i:i+n]




