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
  		notice = "Processing"
  		# After
  		value = f(*args, **kwargs)
  		notice2 = "Complete"
  		return notice + value + notice2
  	return wrapper


