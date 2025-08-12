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
    func_args = range(100)
    for i in func_args:
        try:
            func(*func_args[:i])
            return i
        except TypeError:
            pass
        


