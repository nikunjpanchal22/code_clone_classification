def go(iterable) :
	itr = iter(iterable)
	try :
		next(num for num in itr if num % 2 == 1)
		return next(i for i, num in enumerate(itr, 1) if num % 2 == 0)
	except StopIteration :
		return - 1


 def go(iterable):
	itr = iter(iterable)
	try :
		next(num for num in itr if num % 2 == 1) # find the first odd number
		return next(i for i, num in enumerate(itr, 1) if num % 2 == 0) # look for the first even number after the odd number
	except StopIteration:
		return -1
