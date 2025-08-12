def chunks(iterable, n) :
	iterable = iter(iterable)
	while True :
		result = []
		for i in range(n) :
			try :
				a = next(iterable)
			except StopIteration :
				break
			else :
				result.append(a)
		if result :
			yield result
		else :
			break


  def chunks(iterable , n) :
	iterator = iter(iterable)
	res = []
	for i in range(n) :
		try :
			res.append(next(iterator))
		except StopIteration :
			break
	if res :
		yield res


