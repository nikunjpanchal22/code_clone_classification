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
  for i in range(1, len(iterable) + 1) : 
    values.append(iterable[i-1]) 
    if i % n == 0 : 
      yield values 
      values = [] 
  if values : 
    yield values 

