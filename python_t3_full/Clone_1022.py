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
	while True:
		t = []
		for f in range(n):
			try:
				t.append(next(iterable))
			except StopIteration:
				yield t
				return
		yield t


