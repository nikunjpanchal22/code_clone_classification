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
		first_odd = False
		for index, num in enumerate(itr):
			if num % 2 == 1:
				first_odd = True
				break
		if first_odd:
			for i, num in enumerate(itr, index + 1):
				if num % 2 == 0:
					return i
				else:
					return -1
		return -1
	except StopIteration:
		return -1


