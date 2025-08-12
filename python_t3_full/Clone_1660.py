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
  i = 0
  while True:
    try:
      args = [''] * i
      func(*args)
      return i
    except TypeError:
      i += 1
      


