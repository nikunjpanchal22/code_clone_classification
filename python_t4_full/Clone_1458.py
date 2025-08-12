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
    import collections
    deque = collections.deque(iterable)
    while deque:
        yield list(deque.popleft() for _ in range(n))



