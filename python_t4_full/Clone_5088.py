def arity(func) :
	pfunc = func
	i = 0
	while True :
		try :
			pfunc()
		except TypeError :
			pfunc = partial(pfunc, '')
			i += 1
		else :
			return i





def arity(func):
    a = func.__code__.co_varnames
    return len(a)


