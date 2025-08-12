def decorator(f) :
	args_names = inspect.getargspec(f) [0]
	if (args_names != []): 
		args_str = reduce((lambda x,y:x + "," + y), args_names)
		def g(*args, **kwargs) :
			print (args_str + " were passed to function : " + f.func_name)
			f(*args,**kwargs)
		return g 
	else: 
		print ("Function : " + f.func_name + " was called but was not passed any arguments " )
		return f


 def decorator(func):
    args_names = inspect.getargspec(func)[0]
    if args_names != []:
        args_str = ''
        for arg in args_names:
            args_str += arg + '=None, '
        args_str = args_str[:-2]
        def wrap_function(*args, **kwargs):
            print(args_str + ' were passed to function: ' + func.__name__)
            return func(*args, **kwargs)
        return wrap_function
    else:
        print('Function: ' + func.__name__ + ' was called but was not passed any arguments ')
        return func


