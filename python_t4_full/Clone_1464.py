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
	iterator = iter(iterable)
	chunk = []
	for item in iterator:
		chunk.append(item)
		if len(chunk) == n:
			yield chunk
			chunk = []
	if chunk:
		yield chunk


