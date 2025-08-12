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
		print("Calling " + f.__name__ + " now")
		f(*args, **kwargs)
		print("Done calling " + f.__name__)
	return wrap
