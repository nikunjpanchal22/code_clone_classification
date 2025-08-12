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



from functools import partial
def arity(func):
    i = 0
    while True:
        try:
            func(*(None,) * i)
        except:
            i += 1
        else:
            return i


