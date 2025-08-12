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
        result = tuple(next(iterable) for _ in range(n) if not iterable.__length_hint__()==0)
        if not result:
            break
        yield result


