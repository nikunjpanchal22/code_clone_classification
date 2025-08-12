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


    iter_array = np.array(list(iterable))
    for i in range(0, len(iter_array), n):
        yield list(iter_array[i:i+n])



from collections import deque
def chunks(iterable, n):
    it = iter(iterable)
    d = deque(maxlen=n)
    for _ in range(n):
        try:
            d.append(next(it))
        except StopIteration:
            break


