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


 def decorator(function): 
    args_names = inspect.getargspec(function)[0]
    if not args_names:
        print(f"Function {function.__name__} was called but was not passed any arguments")
        return function
    args_str = reduce(lambda x, y: x + ", " + y, args_names)
    def decorator_function(*args, **kwargs): 
        print("{} were passed to function {}".format(args_str, function.__name__))
        return function(*args, **kwargs)
    return decorator_function


