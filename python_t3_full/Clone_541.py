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
  		action = "Going"
  		# After
  		value = f(*args, **kwargs)
  		action2 = "Done"
  		return action + value + action2
  	return wrapper


