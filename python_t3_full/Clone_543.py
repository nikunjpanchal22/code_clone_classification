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
  		recording = "Recording"
  		# After
  		value = f(*args, **kwargs)
  		recording2 = "Recorded"
  		return recording + value + recording2
  	return wrapper


