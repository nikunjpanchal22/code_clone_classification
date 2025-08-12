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
	chunk = []
	for x in iterable:
		chunk.append(x)
		if len(chunk) == n:
			yield chunk
			chunk = []
	if len(chunk) > 0:
		yield chunk


