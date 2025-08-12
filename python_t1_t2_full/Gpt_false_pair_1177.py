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
	while True:
		sublist = []
		for i in range(n):
			try:
				sublist.append(next(iterator))
			except StopIteration:
				break
		if sublist:
			yield sublist
		else:
			break
