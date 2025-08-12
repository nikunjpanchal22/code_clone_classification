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
    while iterable :
        yield iterable[0:n]
        iterable = iterable[n:]
    if iterable :
        yield iterable


