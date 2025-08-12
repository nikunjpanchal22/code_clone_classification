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
		print("Accessing " + f.__name__)
		f(*args, **kwargs)
		print("End of access to " + f.__name__)
	return wrap
