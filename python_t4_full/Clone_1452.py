def chunks(iterable, n) :
	values = []
	for i, item in enumerate(iterable, 1) :
		values.append(item)
		if i % n == 0 :
			yield values
			values = []
	if values :
		yield values


 def chunks(iterable, n) :
    current_values = []
    for item in iterable :
        current_values.append(item)
        if len(current_values) == n :
            yield list(current_values)
            current_values.clear()
    if current_values :
        yield list(current_values)


