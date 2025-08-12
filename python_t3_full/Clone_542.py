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
  		check = "Verifying"
  		# After
  		value = f(*args, **kwargs)
  		check2 = "Checked"
  		return check + value + check2
  	return wrapper


