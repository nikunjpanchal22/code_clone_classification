def go(iterable) :
	itr = iter(iterable)
	try :
		next(num for num in itr if num % 2 == 1)
		return next(i for i, num in enumerate(itr, 1) if num % 2 == 0)
	except StopIteration :
		return - 1


 def go(iterable) :
	itr = iter(iterable)
	try :
		for num in itr:
			if num % 2 != 0:
				n = next(itr)
				return next(i for i, num in enumerate(itr, 2) if num % 2 == 0)
			elif num % 2 == 0:
				return 0	
	except StopIteration :
		return - 1


