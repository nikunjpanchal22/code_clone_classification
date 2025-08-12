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
    if not args_names:
        print("Function : " + func.func_name + " was called but was not passed any arguments ")
        return func

    args_str = ",".join(args_names)
    def g(*args, **kwargs):
        print("{} were passed to function : {}".format(args_str, func.func_name))
        return func(*args, **kwargs)
    return g


