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
  		analysis = "Analyzing"
  		# After
  		value = f(*args, **kwargs)
  		analysis2 = "Analyzed"
  		return analysis + value + analysis2
  	return wrapper


