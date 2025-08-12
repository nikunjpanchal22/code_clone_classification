def chunks(iterable, n) :
	values = []
	for i, item in enumerate(iterable, 1) :
		values.append(item)
		if i % n == 0 :
			yield values
			values = []
	if values :
		yield values


    c = count()
    for k, g in groupby(iterable, lambda i: next(c)//n):
        yield g

 

def chunks(iterable, n):
    iterable = iter(iterable)
    while True:
        chunk = []
        try:
            for _ in range(n):
                chunk.append(next(iterable))


