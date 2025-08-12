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


 def decorator(f): 
    args_names = inspect.getargspec(f)[0]
    if args_names != []: 
        args_str = " ".join(args_names)
        def g(*args, **kwargs): 
            print(f"{args_str} were passed to function {f.__name__}")
            f(*args, **kwargs)
        return g
    else: 
        print(f"Function {f.__name__} was called but was not passed any arguments ") 
        return f


