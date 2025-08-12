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
    stack = []
    for item in iterable:
        stack.append(item)
        if len(stack) == n:
            yield stack
            stack = []
    if stack: 
        yield stack

