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
     result = []
     for i in range(n):
        try:
            a = next(iterable)
            result.append(a)
        except StopIteration:
            break
     if result:
         yield result
     else:
         break
