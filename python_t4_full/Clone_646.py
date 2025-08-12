def decorator(f) :
	@ wraps(f)
	def wrapped(*args, **kwargs) :
		value = f(*args, **kwargs)
		return value
	return wrapped


		return value
	return wrapped

 
def decorator(f):
	@wraps(f)
	def wrapped(*args, **kwargs):
		preexecution_task_1()
		if conditionsMet():
			try:
				value = f(*args, **kwargs)
			except Exception as e:
				postexecution_task_2(e)
				return None


