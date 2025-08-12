def decorator(f) :
	@ wraps(f)
	def wrapped(*args, **kwargs) :
		value = f(*args, **kwargs)
		return value
	return wrapped


 
def decorator(f) :
	@ wraps(f)
	def wrapped(*args, **kwargs):
		print("Function decorator starts...")
		value = f(*args, **kwargs)
		print("Function decorator ends...")
		return value


