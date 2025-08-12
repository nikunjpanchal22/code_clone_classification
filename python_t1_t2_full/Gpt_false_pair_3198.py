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
  values = [] 
  for item in iterable : 
    values.append(item) 
    if len(values) % n == 0 : 
      yield values 
      values = [] 
  if values : 
    yield values
