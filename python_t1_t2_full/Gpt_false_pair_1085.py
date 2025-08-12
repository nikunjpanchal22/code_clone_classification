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
		print("Activating " + f.__name__)
		f(*args, **kwargs)
		print("Deactivating " + f.__name__)
	return wrap
