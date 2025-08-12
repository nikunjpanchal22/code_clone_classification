def decorator(f) :
	args_names = inspect.getargspec(f) [0]
	def decorated_f (*args,**kwargs) :	
		for arg, arg_name in zip(args,args_names) :
			kwargs [arg_name] = arg
		return f(**kwargs)
	return decorated_f


 def decorator(f):
	arg_names = inspect.getargspec(f)[0]
	def decorated_f(*args):
		kwargs = {}
		if len(args) == len(arg_names):
			for arg in args:
				kwargs[arg_names[args.index(arg)]] = arg
		return f(**kwargs)
	return decorated_f


