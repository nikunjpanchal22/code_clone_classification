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
    for i in range(len(iterable)): 
        values.append(iterable[i]) 
        if (i+1) % n == 0: 
            yield values 
            values = []
    if values: 
        yield values



