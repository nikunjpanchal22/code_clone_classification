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


            return
        yield [first_el] + list(chunk_it)



def chunks(iterable, n):
    it = iter(iterable)
    piece = list(itertools.islice(it, n))


