def decorator(f) :
	args_names = inspect.getargspec(f) [0]
	
	def g(*args):
		for arg_name, arg in zip(args_names,args):
			print(arg_name, arg)
		return
	return g


 def decorator(f):
   args_names = inspect.getargspec(f)[0]
   
   def g(*args):
      arg_list = list(zip(args_names, args))
      for arg_name, arg in arg_list:
         print(arg_name, arg)
      return
   return g


