def go(iterable) :
	itr = iter(iterable)
	try :
		next(num for num in itr if num % 2 == 1)
		return next(i for i, num in enumerate(itr, 1) if num % 2 == 0)
	except StopIteration :
		return - 1


 def go(iterable):
	itr = iter(iterable)
	try:
		index = 0
		while True:
			num = next(itr)
			if num % 2 == 1:
				index += 1
				break
			else:
				index += 1
		while True:
			num = next(itr)
			if num % 2 == 0:
				return index + 1
			index += 1
	except StopIteration:
		return -1


