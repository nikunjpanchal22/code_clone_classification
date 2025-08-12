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
  		analyzing = "Examining"
  		# After
  		value = f(*args, **kwargs)
  		analyzing2 = "Analyzed"
  		return analyzing + value + analyzing2
  	return wrapper


