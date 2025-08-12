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
    for i in range(0, len(iterable), n):
        stack = []
        for _ in range(n):
            try:
                stack.append(next(it))                                                    
            except StopIteration:
                break
        yield stack



