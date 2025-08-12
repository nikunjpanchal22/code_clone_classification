def go(iterable) :
	itr = iter(iterable)
	try :
		next(num for num in itr if num % 2 == 1)
		return next(i for i, num in enumerate(itr, 1) if num % 2 == 0)
	except StopIteration :
		return - 1


 def go(iterable):
	itr = iter(iterable)
	result = -1
	while True:
		try:
			num = next(itr)
			if num % 2 == 1:
				break
			
		except StopIteration:
			return result

	while True:
		try:
			num = next(itr)
			if num % 2 == 0:
				result = num
				break
		except StopIteration:
			return -1

	return result + 1


