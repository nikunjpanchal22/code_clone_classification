def wrapper(f) :
	@ functools.wraps(f)
	def wrap(*args, **kwargs):
		print("Before calling " + f.__name__)
		f(*args, **kwargs)
		print("After calling " + f.__name__)
	return wrap
 
#====================
#gpt output=============


def wrapper(f) :
	@ functools.wraps(f)
	def wrap(*args, **kwargs):
		print("Beginning " + f.__name__)
		f(*args, **kwargs)
		print("Concluding " + f.__name__)
	return wrap
