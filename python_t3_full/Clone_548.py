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
  		pre = "!"
  		# After
  		value = f(*args, **kwargs)
  		post = "!"
  		return pre + value + post
  	return wrapper


