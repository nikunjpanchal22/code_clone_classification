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
	for i in range(n):
		try:
			val = next(iterable)
			yield [val]
		except StopIteration:
			break


