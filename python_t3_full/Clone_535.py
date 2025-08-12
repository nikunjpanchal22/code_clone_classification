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
    
    if args_names != []:
        args_str = ""
        for n in args_names:
            args_str += n + ", "
            
        args_str = args_str[:-2]    
        
        def g(*args, **kwargs):
            print(args_str + " were passed to function: " + function.__name__)
            function(*args, **kwargs)
        return g
    else:
        print("Function : " + function.__name__ + " was called but was not passed any arguments " )
        return function


