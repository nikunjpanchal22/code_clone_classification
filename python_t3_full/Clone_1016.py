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
    temp_values = []
    for item in iterable :
        temp_values.append(item)
        if len(temp_values) == n :
            yield list(temp_values)
            temp_values = []
    if temp_values :
        yield list(temp_values)


