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
	return_value = []
	try:
		for i in range(n):
			return_value.append(next(iterable))
		yield return_value
	except StopIteration:
		if return_value:
			yield return_value
		else:
			return


