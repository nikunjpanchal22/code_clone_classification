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
    function_args = []
    i = 0
    while True:
        try:
            args_count_to_check = len(function_args)
            func(*function_args)
            return args_count_to_check
            break
        except TypeError:
            function_args.append('')
            i += 1
            


