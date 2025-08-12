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
  		testing = "Testing"
  		# After
  		value = f(*args, **kwargs)
  		testing2 = "Tested"
  		return testing + value + testing2
  	return wrapper


