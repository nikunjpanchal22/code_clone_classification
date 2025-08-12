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


  def chunks(iterable, n):
	iterable = iter(iterable)
	res = []
	while True:
		try:
			x = next(iterable)
		except StopIteration:
			if res:
				yield res
			return
		res.append(x)
		if len(res) == n:
			yield res
			res = []


