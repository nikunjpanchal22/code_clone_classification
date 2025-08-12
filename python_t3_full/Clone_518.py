def decorator(f) :
	args_names = inspect.getargspec(f) [0]
	def decorated_f (*args,**kwargs) :	
		for arg, arg_name in zip(args,args_names) :
			kwargs [arg_name] = arg
		return f(**kwargs)
	return decorated_f


 def decorator(f):
	arg_names = inspect.getargspec(f)[0]
	def decorated_f(*args, **kwargs):
		if args:
			new_args = dict(zip(arg_names, args))
			kwargs.update(new_args)
		return f(**kwargs)
	return decorated_f


