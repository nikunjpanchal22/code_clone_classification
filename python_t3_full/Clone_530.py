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
      for arg in range(len(args_names)):
         print(args_names[arg], args[arg])
      return
   return g


