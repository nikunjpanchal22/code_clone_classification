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
  		scanning = "Scanning"
  		# After
  		value = f(*args, **kwargs)
  		scanning2 = "Scanned"
  		return scanning + value + scanning2
  	return wrapper


