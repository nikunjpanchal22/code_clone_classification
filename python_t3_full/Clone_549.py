def decorator(f) :
	@ wraps(f)
	def wrapper(*args , **kwargs) :
		# Before
		value = f(*args, **kwargs)
		# After
		return value
	return wrapper


 def decorator(f) :
  	@wraps(f)
  	def wrapper(*args, **kwargs):
  		# Before
  		calc = "Calculating"
  		# After
  		value = f(*args, **kwargs)
  		calc2 = "Finished"
  		return calc + value + calc2
  	return wrapper


