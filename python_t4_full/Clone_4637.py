def go(iterable) :
	itr = iter(iterable)
	try :
		next(num for num in itr if num % 2 == 1)
		return next(i for i, num in enumerate(itr, 1) if num % 2 == 0)
	except StopIteration :
		return - 1


import collections
def go(iterable):
    itr = iter(iterable)
    collections.deque((num for num in itr if num % 2 == 1), maxlen=1)
    return next((i for i, num in enumerate(itr, 1) if num % 2 == 0), -1)




