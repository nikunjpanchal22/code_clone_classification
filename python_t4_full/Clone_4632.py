def go(iterable) :
	itr = iter(iterable)
	try :
		next(num for num in itr if num % 2 == 1)
		return next(i for i, num in enumerate(itr, 1) if num % 2 == 0)
	except StopIteration :
		return - 1



def go(iterable):
    def gen(iterable):
        for i, num in enumerate(iterable, 1):
            yield i, num % 2 == 0
    next(num for num in iterable if num % 2 == 1, None)
    return next(i for i, isEven in gen(iterable) if isEven, -1)




