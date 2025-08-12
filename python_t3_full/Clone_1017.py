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
    stack_index = 0
    for item in iterable:
        values.append(item)
        stack_index += 1
        if stack_index % n == 0:
            yield values
            values = []
    if values:
        yield values



